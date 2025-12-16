package com.avito.android.publish.drafts.di;

import Zd0.InterfaceC19543a;
import android.app.Application;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.c0;
import com.avito.android.publish.K;
import com.avito.android.publish.PhotoSyncDelegateImpl;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishDraftsModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/publish/PhotoSyncDelegateImpl;", "draftId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class i extends N implements Y41.l<String, PhotoSyncDelegateImpl> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f235346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerIntentFactory f235347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.photo_cache.b f235348n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f235349o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19543a f235350p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Application application, PhotoPickerIntentFactory photoPickerIntentFactory, com.avito.android.photo_cache.b bVar, InterfaceC35745a5 interfaceC35745a5, InterfaceC19543a interfaceC19543a) {
        super(1);
        this.f235346l = application;
        this.f235347m = photoPickerIntentFactory;
        this.f235348n = bVar;
        this.f235349o = interfaceC35745a5;
        this.f235350p = interfaceC19543a;
    }

    @Override // Y41.l
    public final PhotoSyncDelegateImpl invoke(String str) {
        String str2 = str;
        c0 c0Var = new c0(this.f235346l, str2, this.f235347m, false, 8, null);
        com.avito.android.photo_cache.b bVar = this.f235348n;
        InterfaceC35745a5 interfaceC35745a5 = this.f235349o;
        return new PhotoSyncDelegateImpl(c0Var, new K(new com.avito.android.photo_cache.n(str2, bVar, interfaceC35745a5), interfaceC35745a5, this.f235350p), interfaceC35745a5);
    }
}
