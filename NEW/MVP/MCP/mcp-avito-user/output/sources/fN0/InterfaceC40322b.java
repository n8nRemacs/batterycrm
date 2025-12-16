package fN0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoPickerInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LfN0/b;", "", "a", "b", "c", "LfN0/b$a;", "LfN0/b$b;", "LfN0/b$c;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fN0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40322b {

    /* compiled from: VideoPickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfN0/b$a;", "LfN0/b;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN0.b$a */
    public static final /* data */ class a implements InterfaceC40322b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395869a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 163553260;
        }

        @k
        public final String toString() {
            return "LoadVideoCards";
        }
    }

    /* compiled from: VideoPickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfN0/b$b;", "LfN0/b;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11149b implements InterfaceC40322b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11149b f395870a = new C11149b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11149b);
        }

        public final int hashCode() {
            return 255208389;
        }

        @k
        public final String toString() {
            return "ShowPermissionRequest";
        }
    }

    /* compiled from: VideoPickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfN0/b$c;", "LfN0/b;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN0.b$c */
    public static final /* data */ class c implements InterfaceC40322b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.video_picker.ui.item.video_card.c> f395871a;

        public c(@k List<com.avito.android.video_picker.ui.item.video_card.c> list) {
            this.f395871a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395871a, ((c) obj).f395871a);
        }

        public final int hashCode() {
            return this.f395871a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateVideoCards(videoCards="), this.f395871a, ')');
        }
    }
}
