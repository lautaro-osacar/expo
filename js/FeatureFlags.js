import { Platform } from 'react-native';

export default {
  HIDE_EXPLORE_TABS: Platform.OS === 'android' ? true : false,
  DISPLAY_EXPERIMENTAL_EXPLORE_TABS: false,
  INFINITE_SCROLL_EXPLORE_TABS: false,
};
