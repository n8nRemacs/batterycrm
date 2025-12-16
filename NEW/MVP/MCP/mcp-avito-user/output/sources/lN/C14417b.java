package Ln;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.media3.common.C23088b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoriesState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLn/b;", "", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ln.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14417b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f10106a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f10107b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f10108c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C14418c f10109d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f10110e;

    /* compiled from: CategoriesState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLn/b$a;", "", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ln.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10111a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f10112b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f10111a = str;
            this.f10112b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f10111a, aVar.f10111a) && L.f(this.f10112b, aVar.f10112b);
        }

        public final int hashCode() {
            return this.f10112b.hashCode() + (this.f10111a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonViewState(title=");
            sb2.append(this.f10111a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f10112b, ')');
        }
    }

    public C14417b(@k String str, @k String str2, @l Image image, @k C14418c c14418c, @l a aVar) {
        this.f10106a = str;
        this.f10107b = str2;
        this.f10108c = image;
        this.f10109d = c14418c;
        this.f10110e = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14417b)) {
            return false;
        }
        C14417b c14417b = (C14417b) obj;
        return L.f(this.f10106a, c14417b.f10106a) && L.f(this.f10107b, c14417b.f10107b) && L.f(this.f10108c, c14417b.f10108c) && L.f(this.f10109d, c14417b.f10109d) && L.f(this.f10110e, c14417b.f10110e);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f10106a.hashCode() * 31, 31, this.f10107b);
        Image image = this.f10108c;
        int iA2 = C23088b.a((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f10109d.f10113a);
        a aVar = this.f10110e;
        return iA2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CategoriesItem(id=" + this.f10106a + ", title=" + this.f10107b + ", image=" + this.f10108c + ", children=" + this.f10109d + ", buttonViewState=" + this.f10110e + ')';
    }
}
