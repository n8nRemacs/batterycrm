package com.akita.compose.component.chips.internal;

import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiLineLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f60905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f60905l = cVar;
    }

    @Override // Y41.a
    public final Integer invoke() {
        c cVar = this.f60905l;
        ArrayList arrayList = cVar.f60906a;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += ((K0) arrayList.get(i13)).f40345b;
        }
        return Integer.valueOf(((cVar.f60906a.size() - 1) * cVar.f60907b) + i12);
    }
}
