package com.avito.android.details;

import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.view.a;
import com.avito.android.select.s;
import com.avito.android.select.x;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t3.l0;

/* compiled from: SelectParameterClickListener.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details/k;", "Lcom/avito/android/details/j;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f135909a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f135910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.i f135911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f135912d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public a f135913e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public a.b f135914f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final s f135915g = new s();

    @Inject
    public k(@Named("min_values_for_search") int i12, @Y61.k x xVar, @Y61.k com.avito.android.select.i iVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f135909a = i12;
        this.f135910b = xVar;
        this.f135911c = iVar;
        this.f135912d = lVar;
    }

    @Override // com.avito.android.details.j
    public final void F(@Y61.k a aVar) {
        this.f135913e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0204, code lost:
    
        r13.add(new com.avito.android.blueprints.selector_card_group_bottom_sheet.j(r15, (com.avito.android.remote.model.ParcelableEntity) r8, r17, r18, r19, kotlin.jvm.internal.L.f(r1.getValue(), r5.getId())));
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.details.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(@Y61.k com.avito.conveyor_item.a r67) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.details.k.G(com.avito.conveyor_item.a):void");
    }

    @Override // com.avito.android.details.j
    public final void c0() {
        this.f135914f = null;
    }

    @Override // com.avito.android.details.j
    public final void e(@Y61.l a.b bVar) {
        this.f135914f = bVar;
    }
}
