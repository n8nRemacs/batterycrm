package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.inn.VerificationFormBuilderResult;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FormBuilderReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "LTM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements u<FormBuilderInternalAction, TM0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f325474b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.p f325475c;

    /* compiled from: FormBuilderReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f325476a;

        static {
            int[] iArr = new int[VerificationFormBuilderResult.Action.Style.values().length];
            try {
                iArr[VerificationFormBuilderResult.Action.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationFormBuilderResult.Action.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f325476a = iArr;
        }
    }

    @Inject
    public p(@Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.verification.inn.p pVar) {
        this.f325474b = interfaceC35741a1;
        this.f325475c = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r12) {
        /*
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r12.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r1.next()
            com.avito.conveyor_item.a r2 = (com.avito.conveyor_item.a) r2
            boolean r3 = r2 instanceof com.avito.android.verification.inn.list.Hidable
            if (r3 != 0) goto L23
            goto Ldf
        L23:
            r3 = r2
            com.avito.android.verification.inn.list.Hidable r3 = (com.avito.android.verification.inn.list.Hidable) r3
            java.util.Map r3 = r3.b()
            boolean r4 = r3.isEmpty()
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L89
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L39
            goto L87
        L39:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L41:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.util.Iterator r7 = r12.iterator()
        L51:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r7.next()
            r10 = r8
            com.avito.conveyor_item.a r10 = (com.avito.conveyor_item.a) r10
            java.lang.String r10 = r10.getStringId()
            java.lang.Object r11 = r4.getKey()
            boolean r10 = kotlin.jvm.internal.L.f(r10, r11)
            if (r10 == 0) goto L51
            goto L6f
        L6e:
            r8 = r9
        L6f:
            boolean r7 = r8 instanceof com.avito.android.verification.inn.list.checkbox.a
            if (r7 == 0) goto L76
            r9 = r8
            com.avito.android.verification.inn.list.checkbox.a r9 = (com.avito.android.verification.inn.list.checkbox.a) r9
        L76:
            if (r9 == 0) goto L89
            boolean r7 = r9.f323939h
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r7 != r4) goto L89
            goto L41
        L87:
            r3 = r6
            goto L8a
        L89:
            r3 = r5
        L8a:
            java.lang.String r4 = r2.getStringId()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r12.iterator()
        L97:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La9
            java.lang.Object r9 = r8.next()
            boolean r10 = r9 instanceof com.avito.android.verification.inn.list.disclosure.a
            if (r10 == 0) goto L97
            r7.add(r9)
            goto L97
        La9:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto Lb0
            goto Lcd
        Lb0:
            java.util.Iterator r7 = r7.iterator()
        Lb4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lcd
            java.lang.Object r8 = r7.next()
            com.avito.android.verification.inn.list.disclosure.a r8 = (com.avito.android.verification.inn.list.disclosure.a) r8
            java.util.List<java.lang.String> r9 = r8.f323961g
            boolean r9 = r9.contains(r4)
            if (r9 == 0) goto Lb4
            boolean r8 = r8.f323959e
            if (r8 != 0) goto Lb4
            r5 = r6
        Lcd:
            if (r3 == 0) goto Ld2
            com.avito.android.verification.inn.list.Hidable$Hidden r3 = com.avito.android.verification.inn.list.Hidable.Hidden.f323898d
            goto Ld9
        Ld2:
            if (r5 == 0) goto Ld7
            com.avito.android.verification.inn.list.Hidable$Hidden r3 = com.avito.android.verification.inn.list.Hidable.Hidden.f323897c
            goto Ld9
        Ld7:
            com.avito.android.verification.inn.list.Hidable$Hidden r3 = com.avito.android.verification.inn.list.Hidable.Hidden.f323896b
        Ld9:
            com.avito.android.verification.inn.list.Hidable r2 = (com.avito.android.verification.inn.list.Hidable) r2
            com.avito.conveyor_item.a r2 = r2.a(r3)
        Ldf:
            r0.add(r2)
            goto L11
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_form_builder.mvi.p.b(java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final TM0.c a(com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction r21, TM0.c r22) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_form_builder.mvi.p.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
