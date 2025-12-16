package oe;

import Y61.k;
import Y61.l;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectProfileFieldList.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loe/a;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oe.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C44763a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<SelectProfileField> f419975a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f419976b;

    /* JADX WARN: Multi-variable type inference failed */
    public C44763a(@k List<? extends SelectProfileField> list, @l AttributedText attributedText) {
        this.f419975a = list;
        this.f419976b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44763a)) {
            return false;
        }
        C44763a c44763a = (C44763a) obj;
        return L.f(this.f419975a, c44763a.f419975a) && L.f(this.f419976b, c44763a.f419976b);
    }

    public final int hashCode() {
        int iHashCode = this.f419975a.hashCode() * 31;
        AttributedText attributedText = this.f419976b;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectProfileFieldList(selectProfileFields=");
        sb2.append(this.f419975a);
        sb2.append(", warning=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f419976b, ')');
    }

    public /* synthetic */ C44763a(List list, AttributedText attributedText, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : attributedText);
    }
}
