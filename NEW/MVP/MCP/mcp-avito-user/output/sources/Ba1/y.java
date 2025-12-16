package Ba1;

import android.os.Bundle;
import com.avito.android.R;
import ru.mts.biometry.api.entity.FlowStatus;

/* loaded from: classes9.dex */
public abstract class y {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(W91.h r6, long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof Ba1.x
            if (r0 == 0) goto L13
            r0 = r9
            Ba1.x r0 = (Ba1.x) r0
            int r1 = r0.f1557s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1557s = r1
            goto L18
        L13:
            Ba1.x r0 = new Ba1.x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1556r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1557s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            W91.h r6 = r0.f1555q
            kotlin.C42729a0.b(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C42729a0.b(r9)
            r9 = 3
            long r4 = (long) r9
            long r7 = r7 * r4
            r0.f1555q = r6
            r0.f1557s = r3
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r7 = 2131956984(0x7f1314f8, float:1.955054E38)
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r8 = 2130974503(0x7f041727, float:1.755783E38)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            r9 = 2131956937(0x7f1314c9, float:1.9550444E38)
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<ru.mts.biometry.sdk.utils.k> r2 = ru.mts.biometry.sdk.utils.k.class
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = r1.newInstance(r0)
            ru.mts.biometry.sdk.base.p r0 = (ru.mts.biometry.sdk.base.p) r0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "arg_title"
            r4 = 2131956920(0x7f1314b8, float:1.955041E38)
            r1.putInt(r2, r4)
            java.lang.String r2 = "arg_title_string"
            r4 = 0
            r1.putString(r2, r4)
            if (r7 == 0) goto L88
            int r7 = r7.intValue()
            java.lang.String r2 = "arg_description"
            r1.putInt(r2, r7)
        L88:
            java.lang.String r7 = "arg_show_button"
            r1.putBoolean(r7, r3)
            if (r8 == 0) goto L98
            int r7 = r8.intValue()
            java.lang.String r8 = "arg_icon_attr"
            r1.putInt(r8, r7)
        L98:
            if (r9 == 0) goto La3
            int r7 = r9.intValue()
            java.lang.String r8 = "arg_button_title"
            r1.putInt(r8, r7)
        La3:
            r0.setArguments(r1)
            ru.mts.biometry.sdk.utils.k r0 = (ru.mts.biometry.sdk.utils.k) r0
            Aa1.b.a(r6, r0)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ba1.y.a(W91.h, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final ru.mts.biometry.sdk.base.p b(FlowStatus flowStatus) {
        String status = flowStatus != null ? flowStatus.getStatus() : null;
        if (status != null) {
            int iHashCode = status.hashCode();
            if (iHashCode != -1712539573) {
                if (iHashCode != -1559202535) {
                    if (iHashCode != -819287695) {
                        if (iHashCode == 944734667 && status.equals(FlowStatus.EXPIRED)) {
                            return d();
                        }
                    } else if (status.equals(FlowStatus.DATA_ACCEPTED)) {
                        ru.mts.biometry.sdk.base.p pVar = (ru.mts.biometry.sdk.base.p) ru.mts.biometry.sdk.utils.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        Bundle bundle = new Bundle();
                        bundle.putInt("arg_title", R.string.sdk_bio_error_data_accepted);
                        bundle.putString("arg_title_string", null);
                        bundle.putBoolean("arg_show_button", true);
                        bundle.putInt("arg_icon_attr", R.attr.sdkBioIcInfo);
                        bundle.putInt("arg_button_title", R.string.sdk_bio_title_close);
                        pVar.setArguments(bundle);
                        return (ru.mts.biometry.sdk.utils.e) pVar;
                    }
                } else if (status.equals(FlowStatus.SYSTEM_ERROR)) {
                    return e();
                }
            } else if (status.equals(FlowStatus.IDENTIFICATION_FAILED)) {
                return c();
            }
        }
        ru.mts.biometry.sdk.base.p pVar2 = (ru.mts.biometry.sdk.base.p) ru.mts.biometry.sdk.utils.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("arg_title", R.string.sdk_bio_error_common_title);
        bundle2.putString("arg_title_string", null);
        bundle2.putInt("arg_description", R.string.sdk_bio_error_common_description);
        bundle2.putBoolean("arg_show_button", true);
        bundle2.putInt("arg_icon_attr", R.attr.sdkBioIcError);
        pVar2.setArguments(bundle2);
        return (ru.mts.biometry.sdk.utils.e) pVar2;
    }

    public static final ru.mts.biometry.sdk.utils.k c() {
        Integer numValueOf = Integer.valueOf(R.attr.sdkBioIcError);
        Integer numValueOf2 = Integer.valueOf(R.string.sdk_bio_title_close);
        ru.mts.biometry.sdk.base.p pVar = (ru.mts.biometry.sdk.base.p) ru.mts.biometry.sdk.utils.k.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("arg_title", R.string.sdk_bio_error_identification_failed);
        bundle.putString("arg_title_string", null);
        bundle.putBoolean("arg_show_button", true);
        bundle.putInt("arg_icon_attr", numValueOf.intValue());
        bundle.putInt("arg_button_title", numValueOf2.intValue());
        pVar.setArguments(bundle);
        return (ru.mts.biometry.sdk.utils.k) pVar;
    }

    public static final ru.mts.biometry.sdk.utils.e d() {
        Integer numValueOf = Integer.valueOf(R.string.sdk_bio_error_expired_description);
        Integer numValueOf2 = Integer.valueOf(R.attr.sdkBioIcError);
        ru.mts.biometry.sdk.base.p pVar = (ru.mts.biometry.sdk.base.p) ru.mts.biometry.sdk.utils.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("arg_title", R.string.sdk_bio_error_expired_title);
        bundle.putString("arg_title_string", null);
        bundle.putInt("arg_description", numValueOf.intValue());
        bundle.putBoolean("arg_show_button", true);
        bundle.putInt("arg_icon_attr", numValueOf2.intValue());
        pVar.setArguments(bundle);
        return (ru.mts.biometry.sdk.utils.e) pVar;
    }

    public static final ru.mts.biometry.sdk.utils.k e() {
        Integer numValueOf = Integer.valueOf(R.string.sdk_bio_error_system_description);
        Integer numValueOf2 = Integer.valueOf(R.attr.sdkBioIcError);
        ru.mts.biometry.sdk.base.p pVar = (ru.mts.biometry.sdk.base.p) ru.mts.biometry.sdk.utils.k.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("arg_title", R.string.sdk_bio_error_system_title);
        bundle.putString("arg_title_string", null);
        bundle.putInt("arg_description", numValueOf.intValue());
        bundle.putBoolean("arg_show_button", true);
        bundle.putInt("arg_icon_attr", numValueOf2.intValue());
        pVar.setArguments(bundle);
        return (ru.mts.biometry.sdk.utils.k) pVar;
    }
}
