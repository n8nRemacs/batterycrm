package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;

/* compiled from: FileUploadInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "metaInfoExists", "Lio/reactivex/rxjava3/core/g;", "apply", "(Z)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32074i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32062c f191176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191177c;

    public C32074i(C32062c c32062c, String str) {
        this.f191176b = c32062c;
        this.f191177c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return C41823n.f402260b;
        }
        C32062c c32062c = this.f191176b;
        InterfaceC32024m interfaceC32024m = c32062c.f191127d;
        String str = this.f191177c;
        return interfaceC32024m.m(str).o(new C32072h(c32062c, str));
    }
}
