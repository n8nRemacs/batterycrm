package com.avito.android.publish.drafts;

import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocalDraft.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/h;", "", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.drafts.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C33842h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f235375a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f235376b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f235377c;

    /* renamed from: d, reason: collision with root package name */
    public final int f235378d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f235379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f235380f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f235381g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<AttributeNode> f235382h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<AttributeNode> f235383i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Navigation f235384j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f235385k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LocalPublishState f235386l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final CategoryParameters f235387m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f235388n;

    /* JADX WARN: Multi-variable type inference failed */
    public C33842h(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, int i12, boolean z12, boolean z13, @Y61.l String str4, @Y61.k List<? extends AttributeNode> list, @Y61.k List<? extends AttributeNode> list2, @Y61.k Navigation navigation2, @Y61.l String str5, @Y61.k LocalPublishState localPublishState, @Y61.l CategoryParameters categoryParameters, boolean z14) {
        this.f235375a = str;
        this.f235376b = str2;
        this.f235377c = str3;
        this.f235378d = i12;
        this.f235379e = z12;
        this.f235380f = z13;
        this.f235381g = str4;
        this.f235382h = list;
        this.f235383i = list2;
        this.f235384j = navigation2;
        this.f235385k = str5;
        this.f235386l = localPublishState;
        this.f235387m = categoryParameters;
        this.f235388n = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C33842h a(C33842h c33842h, int i12, String str, ArrayList arrayList, int i13) {
        String str2 = c33842h.f235375a;
        String str3 = c33842h.f235376b;
        String str4 = c33842h.f235377c;
        int i14 = (i13 & 8) != 0 ? c33842h.f235378d : i12;
        boolean z12 = (i13 & 16) != 0 ? c33842h.f235379e : false;
        boolean z13 = c33842h.f235380f;
        String str5 = (i13 & 64) != 0 ? c33842h.f235381g : str;
        List<AttributeNode> list = c33842h.f235382h;
        List list2 = (i13 & 256) != 0 ? c33842h.f235383i : arrayList;
        Navigation navigation2 = c33842h.f235384j;
        String str6 = c33842h.f235385k;
        LocalPublishState localPublishState = c33842h.f235386l;
        CategoryParameters categoryParameters = c33842h.f235387m;
        boolean z14 = c33842h.f235388n;
        c33842h.getClass();
        return new C33842h(str2, str3, str4, i14, z12, z13, str5, list, list2, navigation2, str6, localPublishState, categoryParameters, z14);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33842h)) {
            return false;
        }
        C33842h c33842h = (C33842h) obj;
        return kotlin.jvm.internal.L.f(this.f235375a, c33842h.f235375a) && kotlin.jvm.internal.L.f(this.f235376b, c33842h.f235376b) && kotlin.jvm.internal.L.f(this.f235377c, c33842h.f235377c) && this.f235378d == c33842h.f235378d && this.f235379e == c33842h.f235379e && this.f235380f == c33842h.f235380f && kotlin.jvm.internal.L.f(this.f235381g, c33842h.f235381g) && kotlin.jvm.internal.L.f(this.f235382h, c33842h.f235382h) && kotlin.jvm.internal.L.f(this.f235383i, c33842h.f235383i) && kotlin.jvm.internal.L.f(this.f235384j, c33842h.f235384j) && kotlin.jvm.internal.L.f(this.f235385k, c33842h.f235385k) && kotlin.jvm.internal.L.f(this.f235386l, c33842h.f235386l) && kotlin.jvm.internal.L.f(this.f235387m, c33842h.f235387m) && this.f235388n == c33842h.f235388n;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f235378d, androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f235375a.hashCode() * 31, 31, this.f235376b), 31, this.f235377c), 31), 31, this.f235379e), 31, this.f235380f);
        String str = this.f235381g;
        int iHashCode = (this.f235384j.hashCode() + androidx.compose.foundation.H.e(androidx.compose.foundation.H.e((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f235382h), 31, this.f235383i)) * 31;
        String str2 = this.f235385k;
        int iHashCode2 = (this.f235386l.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        CategoryParameters categoryParameters = this.f235387m;
        return Boolean.hashCode(this.f235388n) + ((iHashCode2 + (categoryParameters != null ? categoryParameters.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalDraft(sessionId=");
        sb2.append(this.f235375a);
        sb2.append(", draftId=");
        sb2.append(this.f235376b);
        sb2.append(", state=");
        sb2.append(this.f235377c);
        sb2.append(", version=");
        sb2.append(this.f235378d);
        sb2.append(", hasLocalChanges=");
        sb2.append(this.f235379e);
        sb2.append(", syncEnabled=");
        sb2.append(this.f235380f);
        sb2.append(", serverDraftId=");
        sb2.append(this.f235381g);
        sb2.append(", slots=");
        sb2.append(this.f235382h);
        sb2.append(", parameters=");
        sb2.append(this.f235383i);
        sb2.append(", navigation=");
        sb2.append(this.f235384j);
        sb2.append(", activeFieldId=");
        sb2.append(this.f235385k);
        sb2.append(", localPublishState=");
        sb2.append(this.f235386l);
        sb2.append(", categoryParameters=");
        sb2.append(this.f235387m);
        sb2.append(", isEmployee=");
        return androidx.appcompat.app.r.x(sb2, this.f235388n, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33842h(String str, String str2, String str3, int i12, boolean z12, boolean z13, String str4, List list, List list2, Navigation navigation2, String str5, LocalPublishState localPublishState, CategoryParameters categoryParameters, boolean z14, int i13, C42822w c42822w) {
        LocalPublishState localPublishState2;
        boolean z15 = (i13 & 16) != 0 ? false : z12;
        boolean z16 = (i13 & 32) != 0 ? true : z13;
        List list3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        String str6 = (i13 & 64) != 0 ? null : str4;
        List list4 = (i13 & 128) != 0 ? C42784z0.f406748b : list;
        List list5 = (i13 & 256) != 0 ? C42784z0.f406748b : list2;
        Navigation navigation3 = (i13 & 512) != 0 ? new Navigation(null, null, null, null, null, null, null, null, null, 511, null) : navigation2;
        String str7 = (i13 & 1024) != 0 ? null : str5;
        if ((i13 & 2048) != 0) {
            localPublishState2 = new LocalPublishState(list3, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            localPublishState2 = localPublishState;
        }
        this(str, str2, str3, i12, z15, z16, str6, list4, list5, navigation3, str7, localPublishState2, (i13 & 4096) != 0 ? null : categoryParameters, (i13 & 8192) != 0 ? false : z14);
    }
}
