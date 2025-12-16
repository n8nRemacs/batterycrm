package fN0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoPickerAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LfN0/a;", "", "a", "b", "c", "LfN0/a$a;", "LfN0/a$b;", "LfN0/a$c;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40321a {

    /* compiled from: VideoPickerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfN0/a$a;", "LfN0/a;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11148a implements InterfaceC40321a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11148a f395866a = new C11148a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11148a);
        }

        public final int hashCode() {
            return -866243695;
        }

        @k
        public final String toString() {
            return "PermissionGranted";
        }
    }

    /* compiled from: VideoPickerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfN0/a$b;", "LfN0/a;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN0.a$b */
    public static final /* data */ class b implements InterfaceC40321a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395867a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 384578514;
        }

        @k
        public final String toString() {
            return "PermissionNotGranted";
        }
    }

    /* compiled from: VideoPickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfN0/a$c;", "LfN0/a;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN0.a$c */
    public static final /* data */ class c implements InterfaceC40321a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.video_picker.ui.item.video_card.c> f395868a;

        public c(@k List<com.avito.android.video_picker.ui.item.video_card.c> list) {
            this.f395868a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395868a, ((c) obj).f395868a);
        }

        public final int hashCode() {
            return this.f395868a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("VideoCardsLoaded(videoCards="), this.f395868a, ')');
        }
    }
}
