package LF0;

import JF0.e;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoGoodsConfigureMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLF0/b;", "LLF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Clock f9884a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Locale f9885b = new Locale("ru", "RU");

    @Inject
    public b(@k Clock clock) {
        this.f9884a = clock;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // LF0.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalDate a(@Y61.k JF0.e.b r1, boolean r2) {
        /*
            r0 = this;
            if (r2 == 0) goto L19
            JF0.c r2 = r1.getChangedState()
            if (r2 == 0) goto Ld
            JF0.f r2 = r2.getSingleDate()
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L19
            JF0.c r1 = r1.getChangedState()
            JF0.f r1 = r1.getSingleDate()
            goto L1d
        L19:
            JF0.f r1 = r1.getSingleDate()
        L1d:
            java.lang.String r1 = r1.getValue()
            java.time.LocalDate r1 = QF0.a.a(r1)
            if (r1 != 0) goto L2e
            GF0.b r1 = GF0.b.f6396a
            r1.getClass()
            java.time.LocalDate r1 = GF0.b.f6397b
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: LF0.b.a(JF0.e$b, boolean):java.time.LocalDate");
    }

    @Override // LF0.a
    @l
    public final String b(@k LocalDate localDate) {
        GF0.b.f6396a.getClass();
        if (localDate.equals(GF0.b.f6397b)) {
            localDate = null;
        }
        if (localDate != null) {
            return localDate.format(DateTimeFormatter.ISO_DATE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // LF0.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Q<com.avito.android.remote.model.ButtonAction, com.avito.android.remote.model.ButtonAction> c(@Y61.k JF0.e.b r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L1a
            JF0.c r5 = r4.getChangedState()
            if (r5 == 0) goto Le
            java.util.List r5 = r5.b()
            goto Lf
        Le:
            r5 = r0
        Lf:
            if (r5 == 0) goto L1a
            JF0.c r4 = r4.getChangedState()
            java.util.List r4 = r4.b()
            goto L1e
        L1a:
            java.util.List r4 = r4.b()
        L1e:
            int r5 = r4.size()
            if (r5 == 0) goto L41
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L36
            java.lang.Object r5 = r4.get(r1)
            java.lang.Object r4 = r4.get(r2)
            kotlin.Q r0 = new kotlin.Q
            r0.<init>(r5, r4)
            goto L47
        L36:
            java.lang.Object r4 = r4.get(r1)
            kotlin.Q r5 = new kotlin.Q
            r5.<init>(r0, r4)
            r0 = r5
            goto L47
        L41:
            kotlin.Q r4 = new kotlin.Q
            r4.<init>(r0, r0)
            r0 = r4
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: LF0.b.c(JF0.e$b, boolean):kotlin.Q");
    }

    @Override // LF0.a
    public final float d(@k e.b bVar, boolean z12) {
        JF0.d dVarA = d.a(bVar, z12);
        return dVarA.getValue() / d.b(dVarA);
    }

    @Override // LF0.a
    public final int e(@k e.b bVar, float f12) {
        return kotlin.math.b.b(f12 * d.b(bVar.getCommission()));
    }

    @Override // LF0.a
    @l
    public final AttributedText f(@k e.b bVar, boolean z12) {
        return (!z12 || bVar.getChangedState() == null) ? bVar.getAgreement() : bVar.getChangedState().getAgreement();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    @Override // LF0.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g(@Y61.k JF0.e.b r17, boolean r18, @Y61.l java.lang.Float r19, @Y61.l java.time.LocalDate r20) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: LF0.b.g(JF0.e$b, boolean, java.lang.Float, java.time.LocalDate):java.util.ArrayList");
    }
}
