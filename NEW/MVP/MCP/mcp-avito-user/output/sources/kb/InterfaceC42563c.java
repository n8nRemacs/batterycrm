package kB;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditBlockOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LkB/c;", "", "a", "b", "c", "LkB/c$a;", "LkB/c$b;", "LkB/c$c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42563c {

    /* compiled from: UniversalWidgetEditBlockOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/c$a;", "LkB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.c$a */
    public static final /* data */ class a implements InterfaceC42563c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalWidgetEditBlockResult f406172a;

        public a(@k UniversalWidgetEditBlockResult universalWidgetEditBlockResult) {
            this.f406172a = universalWidgetEditBlockResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f406172a, ((a) obj).f406172a);
        }

        public final int hashCode() {
            return this.f406172a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(result=" + this.f406172a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditBlockOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/c$b;", "LkB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.c$b */
    public static final /* data */ class b implements InterfaceC42563c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ExtendedProfileImageEditConfig f406173a;

        public b(@k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
            this.f406173a = extendedProfileImageEditConfig;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f406173a, ((b) obj).f406173a);
        }

        public final int hashCode() {
            return this.f406173a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenImageEditor(config=" + this.f406173a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditBlockOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/c$c;", "LkB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11609c implements InterfaceC42563c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406174a;

        public C11609c(@k String str) {
            this.f406174a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11609c) && L.f(this.f406174a, ((C11609c) obj).f406174a);
        }

        public final int hashCode() {
            return this.f406174a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPhotoPicker(operationId="), this.f406174a, ')');
        }
    }
}
