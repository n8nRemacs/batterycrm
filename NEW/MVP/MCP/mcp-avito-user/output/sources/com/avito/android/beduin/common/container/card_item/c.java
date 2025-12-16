package com.avito.android.beduin.common.container.card_item;

import Y41.l;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCardItemContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<BeduinCardItemContainerChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.container.card_item.a f102953l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f102954m;

    /* compiled from: BeduinCardItemContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinCardItemContainerChange.values().length];
            try {
                iArr[BeduinCardItemContainerChange.f102929c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinCardItemContainerChange.f102930d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinCardItemContainerChange.f102931e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinCardItemContainerChange.f102932f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinCardItemContainerChange.f102933g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.beduin.common.container.card_item.a aVar, j jVar) {
        super(1);
        this.f102953l = aVar;
        this.f102954m = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinCardItemContainerChange beduinCardItemContainerChange) {
        int i12 = 25;
        int iOrdinal = beduinCardItemContainerChange.ordinal();
        j jVar = this.f102954m;
        com.avito.android.beduin.common.container.card_item.a aVar = this.f102953l;
        if (iOrdinal == 0) {
            com.avito.android.beduin.common.container.componentsPool.e.c(jVar.f102962c, Collections.singletonList(aVar.f102951g.getChild()), new b(aVar), null, 12);
            G0 g02 = G0.f406611a;
        } else if (iOrdinal == 1) {
            jVar.f102961b.setSelected(aVar.f102951g.f102942b);
            h hVar = jVar.f102961b;
            BeduinCardItemContainerModel beduinCardItemContainerModel = aVar.f102951g;
            hVar.setCheckMarkVisible(beduinCardItemContainerModel);
            hVar.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(i12, beduinCardItemContainerModel, aVar));
            G0 g03 = G0.f406611a;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            jVar.f102961b.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(i12, aVar.f102951g, aVar));
            G0 g04 = G0.f406611a;
        }
        return G0.f406611a;
    }
}
