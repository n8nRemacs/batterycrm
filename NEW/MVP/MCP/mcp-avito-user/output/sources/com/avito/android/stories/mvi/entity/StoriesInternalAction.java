package com.avito.android.stories.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StoriesInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "FullStoryViewed", "LoadWebViewUrl", "Loading", "OpenUri", "PauseView", "Ready", "ResumeView", "SelectedPage", "SetDefaultBackground", "SetStoriesBackground", "ShowToast", "StoryViewed", "TriggerUxFeedback", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$Close;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$FullStoryViewed;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$LoadWebViewUrl;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$Loading;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$OpenUri;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$PauseView;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$Ready;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$ResumeView;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$SelectedPage;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$SetDefaultBackground;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$SetStoriesBackground;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$ShowToast;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$StoryViewed;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$TriggerUxFeedback;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StoriesInternalAction extends n {

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$Close;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f285243b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f285244c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f285245d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<String> f285246e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f285247f;

        public Close() {
            throw null;
        }

        public Close(boolean z12, boolean z13, String str, List list, boolean z14, int i12, C42822w c42822w) {
            z12 = (i12 & 1) != 0 ? true : z12;
            z13 = (i12 & 2) != 0 ? true : z13;
            this.f285243b = z12;
            this.f285244c = z13;
            this.f285245d = str;
            this.f285246e = list;
            this.f285247f = z14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Close)) {
                return false;
            }
            Close close = (Close) obj;
            return this.f285243b == close.f285243b && this.f285244c == close.f285244c && L.f(this.f285245d, close.f285245d) && L.f(this.f285246e, close.f285246e) && this.f285247f == close.f285247f;
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f285243b) * 31, 31, this.f285244c);
            String str = this.f285245d;
            return Boolean.hashCode(this.f285247f) + H.e((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f285246e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Close(needAnimation=");
            sb2.append(this.f285243b);
            sb2.append(", needFinish=");
            sb2.append(this.f285244c);
            sb2.append(", selectedId=");
            sb2.append(this.f285245d);
            sb2.append(", viewedList=");
            sb2.append(this.f285246e);
            sb2.append(", needToShowUxFeedback=");
            return r.x(sb2, this.f285247f, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$FullStoryViewed;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FullStoryViewed implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285248b;

        public FullStoryViewed(@k String str) {
            this.f285248b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FullStoryViewed) && L.f(this.f285248b, ((FullStoryViewed) obj).f285248b);
        }

        public final int hashCode() {
            return this.f285248b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FullStoryViewed(id="), this.f285248b, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$LoadWebViewUrl;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadWebViewUrl implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285249b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, String> f285250c;

        public LoadWebViewUrl(@k String str, @k Map<String, String> map) {
            this.f285249b = str;
            this.f285250c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadWebViewUrl)) {
                return false;
            }
            LoadWebViewUrl loadWebViewUrl = (LoadWebViewUrl) obj;
            return L.f(this.f285249b, loadWebViewUrl.f285249b) && L.f(this.f285250c, loadWebViewUrl.f285250c);
        }

        public final int hashCode() {
            return this.f285250c.hashCode() + (this.f285249b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadWebViewUrl(url=");
            sb2.append(this.f285249b);
            sb2.append(", headers=");
            return r.w(sb2, this.f285250c, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$Loading;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f285251b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -821430851;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$OpenUri;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUri implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f285252b;

        public OpenUri(@k Uri uri) {
            this.f285252b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUri) && L.f(this.f285252b, ((OpenUri) obj).f285252b);
        }

        public final int hashCode() {
            return this.f285252b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("OpenUri(uri="), this.f285252b, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$PauseView;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PauseView implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PauseView f285253b = new PauseView();

        private PauseView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PauseView);
        }

        public final int hashCode() {
            return 309780988;
        }

        @k
        public final String toString() {
            return "PauseView";
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$Ready;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ready implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Ready f285254b = new Ready();

        private Ready() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public final int hashCode() {
            return -1979966876;
        }

        @k
        public final String toString() {
            return "Ready";
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$ResumeView;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResumeView implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResumeView f285255b = new ResumeView();

        private ResumeView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResumeView);
        }

        public final int hashCode() {
            return 512075857;
        }

        @k
        public final String toString() {
            return "ResumeView";
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$SelectedPage;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedPage implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f285256b;

        public SelectedPage(@l String str) {
            this.f285256b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedPage) && L.f(this.f285256b, ((SelectedPage) obj).f285256b);
        }

        public final int hashCode() {
            String str = this.f285256b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectedPage(page="), this.f285256b, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$SetDefaultBackground;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetDefaultBackground implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetDefaultBackground f285257b = new SetDefaultBackground();

        private SetDefaultBackground() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetDefaultBackground);
        }

        public final int hashCode() {
            return -1204780244;
        }

        @k
        public final String toString() {
            return "SetDefaultBackground";
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$SetStoriesBackground;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetStoriesBackground implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetStoriesBackground f285258b = new SetStoriesBackground();

        private SetStoriesBackground() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetStoriesBackground);
        }

        public final int hashCode() {
            return -650305858;
        }

        @k
        public final String toString() {
            return "SetStoriesBackground";
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$ShowToast;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285259b;

        public ShowToast(@k String str) {
            this.f285259b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f285259b, ((ShowToast) obj).f285259b);
        }

        public final int hashCode() {
            return this.f285259b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f285259b, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$StoryViewed;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StoryViewed implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285260b;

        public StoryViewed(@k String str) {
            this.f285260b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoryViewed) && L.f(this.f285260b, ((StoryViewed) obj).f285260b);
        }

        public final int hashCode() {
            return this.f285260b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("StoryViewed(id="), this.f285260b, ')');
        }
    }

    /* compiled from: StoriesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$TriggerUxFeedback;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TriggerUxFeedback implements StoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f285261b;

        public TriggerUxFeedback(boolean z12) {
            this.f285261b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TriggerUxFeedback) && this.f285261b == ((TriggerUxFeedback) obj).f285261b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f285261b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("TriggerUxFeedback(needToShow="), this.f285261b, ')');
        }
    }
}
