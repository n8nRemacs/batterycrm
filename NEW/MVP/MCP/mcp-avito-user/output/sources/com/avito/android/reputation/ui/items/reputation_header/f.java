package com.avito.android.reputation.ui.items.reputation_header;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: ReputationHeaderComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_header/f;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/reputation/ui/items/reputation_header/i;", "Lcom/avito/android/reputation/ui/items/reputation_header/a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC36333c<i, a> {
    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, i iVar) {
        int iS2;
        int iS3;
        a aVar = (a) view;
        i iVar2 = iVar;
        aVar.setCircleRadius(y6.b(iVar2.f254887a));
        r rVar = iVar2.f254888b;
        if (rVar != null) {
            iS2 = s(rVar);
        } else {
            a.f254868i.getClass();
            iS2 = a.f254872m;
        }
        aVar.setLeftColor(iS2);
        r rVar2 = iVar2.f254889c;
        if (rVar2 != null) {
            iS3 = s(rVar2);
        } else {
            a.f254868i.getClass();
            iS3 = a.f254873n;
        }
        aVar.setRightColor(iS3);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new a(viewGroup.getContext(), null, 0, 6, null);
    }
}
