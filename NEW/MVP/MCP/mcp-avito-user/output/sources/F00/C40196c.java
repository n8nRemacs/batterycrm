package f00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.RemoteValidFile;
import com.avito.android.remote.model.text.AttributedText;
import d00.C39479c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import shark.AndroidResourceIdNames;

/* compiled from: DocumentUploadState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf00/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f00.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C40196c extends q {

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final a f395541w = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C39479c> f395542b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<RemoteValidFile> f395543c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f395544d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f395545e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f395546f;

    /* renamed from: g, reason: collision with root package name */
    public final int f395547g;

    /* renamed from: h, reason: collision with root package name */
    public final int f395548h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f395549i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final AttributedText f395550j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f395551k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f395552l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f395553m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f395554n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f395555o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f395556p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final String f395557q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Set<String> f395558r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final List<String> f395559s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final String f395560t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final String f395561u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final d f395562v;

    /* compiled from: DocumentUploadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f00.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40196c(@k List<C39479c> list, @k List<RemoteValidFile> list2, boolean z12, boolean z13, @k String str, int i12, int i13, @k String str2, @k AttributedText attributedText, @k String str3, @k String str4, @k String str5, @k String str6, @l String str7, @l String str8, @k String str9, @k Set<String> set, @k List<String> list3, @l String str10, @l String str11, @k d dVar) {
        this.f395542b = list;
        this.f395543c = list2;
        this.f395544d = z12;
        this.f395545e = z13;
        this.f395546f = str;
        this.f395547g = i12;
        this.f395548h = i13;
        this.f395549i = str2;
        this.f395550j = attributedText;
        this.f395551k = str3;
        this.f395552l = str4;
        this.f395553m = str5;
        this.f395554n = str6;
        this.f395555o = str7;
        this.f395556p = str8;
        this.f395557q = str9;
        this.f395558r = set;
        this.f395559s = list3;
        this.f395560t = str10;
        this.f395561u = str11;
        this.f395562v = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C40196c a(C40196c c40196c, ArrayList arrayList, ArrayList arrayList2, boolean z12, boolean z13, LinkedHashSet linkedHashSet, String str, d dVar, int i12) {
        String str2;
        Set set;
        List<String> list;
        String str3;
        List list2 = (i12 & 1) != 0 ? c40196c.f395542b : arrayList;
        List list3 = (i12 & 2) != 0 ? c40196c.f395543c : arrayList2;
        boolean z14 = (i12 & 4) != 0 ? c40196c.f395544d : z12;
        boolean z15 = (i12 & 8) != 0 ? c40196c.f395545e : z13;
        String str4 = c40196c.f395546f;
        int i13 = c40196c.f395547g;
        int i14 = c40196c.f395548h;
        String str5 = c40196c.f395549i;
        AttributedText attributedText = c40196c.f395550j;
        String str6 = c40196c.f395551k;
        String str7 = c40196c.f395552l;
        String str8 = c40196c.f395553m;
        String str9 = c40196c.f395554n;
        String str10 = c40196c.f395555o;
        String str11 = c40196c.f395556p;
        String str12 = c40196c.f395557q;
        if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            str2 = str11;
            set = c40196c.f395558r;
        } else {
            str2 = str11;
            set = linkedHashSet;
        }
        List<String> list4 = c40196c.f395559s;
        if ((i12 & 262144) != 0) {
            list = list4;
            str3 = c40196c.f395560t;
        } else {
            list = list4;
            str3 = null;
        }
        String str13 = str3;
        String str14 = (i12 & 524288) != 0 ? c40196c.f395561u : str;
        d dVar2 = (i12 & 1048576) != 0 ? c40196c.f395562v : dVar;
        c40196c.getClass();
        return new C40196c(list2, list3, z14, z15, str4, i13, i14, str5, attributedText, str6, str7, str8, str9, str10, str2, str12, set, list, str13, str14, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40196c)) {
            return false;
        }
        C40196c c40196c = (C40196c) obj;
        return L.f(this.f395542b, c40196c.f395542b) && L.f(this.f395543c, c40196c.f395543c) && this.f395544d == c40196c.f395544d && this.f395545e == c40196c.f395545e && L.f(this.f395546f, c40196c.f395546f) && this.f395547g == c40196c.f395547g && this.f395548h == c40196c.f395548h && L.f(this.f395549i, c40196c.f395549i) && L.f(this.f395550j, c40196c.f395550j) && L.f(this.f395551k, c40196c.f395551k) && L.f(this.f395552l, c40196c.f395552l) && L.f(this.f395553m, c40196c.f395553m) && L.f(this.f395554n, c40196c.f395554n) && L.f(this.f395555o, c40196c.f395555o) && L.f(this.f395556p, c40196c.f395556p) && L.f(this.f395557q, c40196c.f395557q) && L.f(this.f395558r, c40196c.f395558r) && L.f(this.f395559s, c40196c.f395559s) && L.f(this.f395560t, c40196c.f395560t) && L.f(this.f395561u, c40196c.f395561u) && L.f(this.f395562v, c40196c.f395562v);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(com.avito.android.actions_sheet.a.b(H.d(r.e(this.f395548h, r.e(this.f395547g, H.d(r.i(r.i(H.e(this.f395542b.hashCode() * 31, 31, this.f395543c), 31, this.f395544d), 31, this.f395545e), 31, this.f395546f), 31), 31), 31, this.f395549i), 31, this.f395550j), 31, this.f395551k), 31, this.f395552l), 31, this.f395553m), 31, this.f395554n);
        String str = this.f395555o;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f395556p;
        int iE2 = H.e(m.g(this.f395558r, H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f395557q), 31), 31, this.f395559s);
        String str3 = this.f395560t;
        int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f395561u;
        return this.f395562v.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "DocumentUploadState(localFiles=" + this.f395542b + ", remoteFiles=" + this.f395543c + ", isSubmitting=" + this.f395544d + ", nextScreenDataLoading=" + this.f395545e + ", name=" + this.f395546f + ", screenNumber=" + this.f395547g + ", screensCount=" + this.f395548h + ", title=" + this.f395549i + ", description=" + this.f395550j + ", fileLimits=" + this.f395551k + ", packageId=" + this.f395552l + ", documentId=" + this.f395553m + ", clientProfileId=" + this.f395554n + ", applicationId=" + this.f395555o + ", applicantType=" + this.f395556p + ", analyticsAttrTitle=" + this.f395557q + ", deletingFileIds=" + this.f395558r + ", documentsIds=" + this.f395559s + ", error=" + this.f395560t + ", lastSelectedFilesProcessId=" + this.f395561u + ", viewState=" + this.f395562v + ')';
    }
}
