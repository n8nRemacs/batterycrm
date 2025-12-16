package com.avito.android.bxcontent;

import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class M extends kotlin.jvm.internal.N implements Y41.l<String, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109361l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(BxContentFragment bxContentFragment) {
        super(1);
        this.f109361l = bxContentFragment;
    }

    @Override // Y41.l
    public final Boolean invoke(String str) {
        String str2 = str;
        com.avito.android.advert.viewed.d dVar = this.f109361l.f109026l4;
        if (dVar == null) {
            dVar = null;
        }
        return Boolean.valueOf(dVar.a(str2));
    }
}
