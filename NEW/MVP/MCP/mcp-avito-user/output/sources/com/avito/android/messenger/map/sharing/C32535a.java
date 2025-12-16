package com.avito.android.messenger.map.sharing;

import android.os.Bundle;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SharingMapFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.sharing.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32535a extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f196715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessageBody.Location f196716m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32535a(String str, MessageBody.Location location) {
        super(1);
        this.f196715l = str;
        this.f196716m = location;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("channel_id", this.f196715l);
        bundle2.putParcelable("initial_position", this.f196716m);
        return G0.f406611a;
    }
}
