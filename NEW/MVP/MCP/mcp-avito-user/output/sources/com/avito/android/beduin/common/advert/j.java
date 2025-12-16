package com.avito.android.beduin.common.advert;

import com.avito.android.favorite.AbstractC30569c;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinFavoriteAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "event", "Lkotlin/G0;", "accept", "(Lcom/avito/android/favorite/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f100554b;

    public j(f fVar) {
        this.f100554b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC30569c abstractC30569c = (AbstractC30569c) obj;
        boolean z12 = abstractC30569c instanceof AbstractC30569c.b;
        f fVar = this.f100554b;
        if (z12) {
            f.c(fVar, C42745f0.P0(((AbstractC30569c.b) abstractC30569c).f155177a), h.f100552l);
        } else if (abstractC30569c instanceof AbstractC30569c.a) {
            f.c(fVar, Collections.singleton(((AbstractC30569c.a) abstractC30569c).f155167a), i.f100553l);
        }
    }
}
