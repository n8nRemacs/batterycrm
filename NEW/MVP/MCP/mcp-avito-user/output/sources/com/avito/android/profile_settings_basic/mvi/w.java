package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14879b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BasicProfileSettingsReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "currentUploadingImage", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class w extends N implements Y41.l<Uri, Uri> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14879b f228914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC14879b interfaceC14879b) {
        super(1);
        this.f228914l = interfaceC14879b;
    }

    @Override // Y41.l
    public final Uri invoke(Uri uri) {
        Uri uri2 = uri;
        if (L.f(uri2, ((InterfaceC14879b.e) this.f228914l).f13873a)) {
            return null;
        }
        return uri2;
    }
}
