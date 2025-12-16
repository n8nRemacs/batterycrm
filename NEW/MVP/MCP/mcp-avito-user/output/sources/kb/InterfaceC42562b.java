package kB;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditBlockInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LkB/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LkB/b$a;", "LkB/b$b;", "LkB/b$c;", "LkB/b$d;", "LkB/b$e;", "LkB/b$f;", "LkB/b$g;", "LkB/b$h;", "LkB/b$i;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kB.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42562b {

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$a;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$a */
    public static final /* data */ class a implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalWidgetEditBlockResult f406161a;

        public a(@k UniversalWidgetEditBlockResult universalWidgetEditBlockResult) {
            this.f406161a = universalWidgetEditBlockResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f406161a, ((a) obj).f406161a);
        }

        public final int hashCode() {
            return this.f406161a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(result=" + this.f406161a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$b;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11608b implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f406162a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f406163b;

        public C11608b(boolean z12, @k Uri uri) {
            this.f406162a = uri;
            this.f406163b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11608b)) {
                return false;
            }
            C11608b c11608b = (C11608b) obj;
            return L.f(this.f406162a, c11608b.f406162a) && this.f406163b == c11608b.f406163b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406163b) + (this.f406162a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageUpdate(image=");
            sb2.append(this.f406162a);
            sb2.append(", isFirstUploader=");
            return r.x(sb2, this.f406163b, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkB/b$c;", "LkB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$c */
    public static final /* data */ class c implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f406164a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -765053873;
        }

        @k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$d;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$d */
    public static final /* data */ class d implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        public final int f406165a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f406166b;

        public d(int i12, @k String str) {
            this.f406165a = i12;
            this.f406166b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f406165a == dVar.f406165a && L.f(this.f406166b, dVar.f406166b);
        }

        public final int hashCode() {
            return this.f406166b.hashCode() + (Integer.hashCode(this.f406165a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTextInput(indexOfInput=");
            sb2.append(this.f406165a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f406166b, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$e;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$e */
    public static final /* data */ class e implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ExtendedProfileImageEditConfig f406167a;

        public e(@k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
            this.f406167a = extendedProfileImageEditConfig;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f406167a, ((e) obj).f406167a);
        }

        public final int hashCode() {
            return this.f406167a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenImageEditor(config=" + this.f406167a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$f;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$f */
    public static final /* data */ class f implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406168a;

        public f(@k String str) {
            this.f406168a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f406168a, ((f) obj).f406168a);
        }

        public final int hashCode() {
            return this.f406168a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPhotoPicker(operationId="), this.f406168a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$g;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$g */
    public static final /* data */ class g implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f406169a;

        public g(boolean z12) {
            this.f406169a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f406169a == ((g) obj).f406169a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406169a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RemoveImage(isFirstUploader="), this.f406169a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkB/b$h;", "LkB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$h */
    public static final /* data */ class h implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f406170a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1553166669;
        }

        @k
        public final String toString() {
            return "ShowValidationErrors";
        }
    }

    /* compiled from: UniversalWidgetEditBlockInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/b$i;", "LkB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.b$i */
    public static final /* data */ class i implements InterfaceC42562b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f406171a;

        public i(boolean z12) {
            this.f406171a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f406171a == ((i) obj).f406171a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406171a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SwitchColorInverted(checked="), this.f406171a, ')');
        }
    }
}
