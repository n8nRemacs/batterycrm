package com.avito.android.gig_tutorials.gigtutorials.mvi.entity;

import NH.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GigTutorialsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "Error", "Loading", "OpenDeeplink", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$ContentLoaded;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$Error;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$Loading;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$OpenDeeplink;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GigTutorialsInternalAction extends n {

    /* compiled from: GigTutorialsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$ContentLoaded;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoaded implements GigTutorialsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f161149b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f161150c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f161151d;

        public ContentLoaded(@k String str, @k String str2, @k List<a> list) {
            this.f161149b = str;
            this.f161150c = str2;
            this.f161151d = list;
        }
    }

    /* compiled from: GigTutorialsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$Error;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "<init>", "()V", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements GigTutorialsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f161152b = new Error();

        private Error() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1753059482;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: GigTutorialsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$Loading;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "<init>", "()V", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements GigTutorialsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f161153b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1416346802;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: GigTutorialsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction$OpenDeeplink;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenDeeplink implements GigTutorialsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f161154b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f161154b = deepLink;
        }
    }
}
