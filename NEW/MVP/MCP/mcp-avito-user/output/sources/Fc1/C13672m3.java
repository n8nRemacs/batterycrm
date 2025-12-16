package Fc1;

import Fc1.AbstractC13567a6;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;

/* renamed from: Fc1.m3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13672m3 extends kotlin.jvm.internal.N implements Y41.p<kotlin.ranges.l, kotlin.ranges.l, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<String> f5671l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13735t4 f5672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5673n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13672m3(l0.h hVar, C13735t4 c13735t4, ArrayList arrayList) {
        super(2);
        this.f5671l = hVar;
        this.f5672m = c13735t4;
        this.f5673n = arrayList;
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [T, java.lang.String] */
    @Override // Y41.p
    public final kotlin.G0 invoke(kotlin.ranges.l lVar, kotlin.ranges.l lVar2) {
        kotlin.ranges.l lVar3 = lVar;
        kotlin.ranges.l lVar4 = lVar2;
        ArrayList arrayList = this.f5673n;
        C13735t4 c13735t4 = this.f5672m;
        l0.h<String> hVar = this.f5671l;
        if (lVar3 != null) {
            String str = hVar.f406842b;
            int i12 = lVar3.f406906c;
            int i13 = lVar3.f406905b;
            String strSubstring = str.substring(i13, i12);
            String strM0 = C43066x.m0(strSubstring, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, strSubstring);
            String strQ0 = C43066x.q0(strSubstring, HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            String str2 = hVar.f406842b;
            int length = strQ0.length() + i13;
            kotlin.ranges.l lVar5 = new kotlin.ranges.l(length, (strSubstring.length() + i13) - 1, 1);
            int i14 = c13735t4.f5833a;
            int i15 = lVar5.f406906c;
            c13735t4.f5833a = (i15 - length) + 1 + i14;
            hVar.f406842b = C43066x.V(length, i15 + 1, str2).toString();
            arrayList.add(new AbstractC13567a6.a.C0297a(i13, strQ0.length() + i13, strM0, 0));
        }
        if (lVar4 != null) {
            String str3 = hVar.f406842b;
            int i16 = lVar4.f406906c;
            int i17 = lVar4.f406905b;
            String strSubstring2 = str3.substring(i17, i16);
            String strM02 = C43066x.m0(strSubstring2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, strSubstring2);
            String strQ02 = C43066x.q0(strSubstring2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            String str4 = hVar.f406842b;
            int length2 = strQ02.length() + i17;
            kotlin.ranges.l lVar6 = new kotlin.ranges.l(length2, (strSubstring2.length() + i17) - 1, 1);
            int i18 = c13735t4.f5833a;
            int i19 = lVar6.f406906c;
            c13735t4.f5833a = (i19 - length2) + 1 + i18;
            hVar.f406842b = C43066x.V(length2, i19 + 1, str4).toString();
            arrayList.add(new AbstractC13567a6.a.b(i17, strQ02.length() + i17, strM02, 0));
        }
        return kotlin.G0.f406611a;
    }
}
