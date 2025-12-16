package com.avito.android.advert.icebreakerseditor;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IcebreakersEditorScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f71265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12) {
        super(0);
        this.f71265l = i12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12 = false;
        int i12 = this.f71265l;
        if (5 <= i12 && i12 < 251) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
