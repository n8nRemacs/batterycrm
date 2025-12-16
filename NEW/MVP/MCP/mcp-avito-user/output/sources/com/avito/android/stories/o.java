package com.avito.android.stories;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;

/* compiled from: StoriesJSInterface.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/stories/o;", "", "", "id", "Lkotlin/G0;", "storyViewed", "(I)V", "", "arg", "viewReady", "(Z)V", "closeView", "selectedPage", "triggerUxFeedback", "fullStoryViewed", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface o {
    @JavascriptInterface
    void closeView(boolean arg);

    @JavascriptInterface
    void fullStoryViewed(int id2);

    @JavascriptInterface
    void selectedPage(int id2);

    @JavascriptInterface
    void storyViewed(int id2);

    @JavascriptInterface
    void triggerUxFeedback(boolean arg);

    @JavascriptInterface
    void viewReady(boolean arg);
}
