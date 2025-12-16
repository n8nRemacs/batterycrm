package com.avito.android.bxcontent;

import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "", "isFavoriteOnBack", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class O extends kotlin.jvm.internal.N implements Y41.p<String, Boolean, io.reactivex.rxjava3.core.I<Boolean>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109368l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(BxContentFragment bxContentFragment) {
        super(2);
        this.f109368l = bxContentFragment;
    }

    @Override // Y41.p
    public final io.reactivex.rxjava3.core.I<Boolean> invoke(String str, Boolean bool) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        com.avito.android.favorite.l lVar = this.f109368l.f109030m4;
        if (lVar == null) {
            lVar = null;
        }
        return lVar.b(str2, zBooleanValue);
    }
}
