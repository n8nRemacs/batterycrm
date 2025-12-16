package com.avito.android.developments_advice;

import com.avito.android.developments_advice.remote.model.CallInterval;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConsultationFormView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/t;", "", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f136203a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f136204b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f136205c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CallInterval f136206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f136207e;

    public t(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l CallInterval callInterval, boolean z12) {
        this.f136203a = str;
        this.f136204b = str2;
        this.f136205c = str3;
        this.f136206d = callInterval;
        this.f136207e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f136203a, tVar.f136203a) && L.f(this.f136204b, tVar.f136204b) && L.f(this.f136205c, tVar.f136205c) && L.f(this.f136206d, tVar.f136206d) && this.f136207e == tVar.f136207e;
    }

    public final int hashCode() {
        String str = this.f136203a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f136204b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f136205c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CallInterval callInterval = this.f136206d;
        return Boolean.hashCode(this.f136207e) + ((iHashCode3 + (callInterval != null ? callInterval.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiFormModel(question=");
        sb2.append(this.f136203a);
        sb2.append(", name=");
        sb2.append(this.f136204b);
        sb2.append(", phone=");
        sb2.append(this.f136205c);
        sb2.append(", callInterval=");
        sb2.append(this.f136206d);
        sb2.append(", isNameInputVisible=");
        return androidx.appcompat.app.r.x(sb2, this.f136207e, ')');
    }

    public /* synthetic */ t(String str, String str2, String str3, CallInterval callInterval, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, callInterval, (i12 & 16) != 0 ? false : z12);
    }
}
