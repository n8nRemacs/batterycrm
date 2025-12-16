package kv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.services_portfolio.project.seller.mvi.entity.ModerationType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProjectSeller.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/a;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C43502a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ModerationType f413262a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<AttributedText> f413263b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f413264c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f413265d;

    public C43502a(@l ModerationType moderationType, @l List list, @l String str, @l ArrayList arrayList) {
        this.f413262a = moderationType;
        this.f413263b = list;
        this.f413264c = str;
        this.f413265d = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43502a)) {
            return false;
        }
        C43502a c43502a = (C43502a) obj;
        return this.f413262a == c43502a.f413262a && L.f(this.f413263b, c43502a.f413263b) && L.f(this.f413264c, c43502a.f413264c) && L.f(this.f413265d, c43502a.f413265d);
    }

    public final int hashCode() {
        ModerationType moderationType = this.f413262a;
        int iHashCode = (moderationType == null ? 0 : moderationType.hashCode()) * 31;
        List<AttributedText> list = this.f413263b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f413264c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList arrayList = this.f413265d;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModerationStatus(type=");
        sb2.append(this.f413262a);
        sb2.append(", messages=");
        sb2.append(this.f413263b);
        sb2.append(", title=");
        sb2.append(this.f413264c);
        sb2.append(", actions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f413265d, ')');
    }
}
