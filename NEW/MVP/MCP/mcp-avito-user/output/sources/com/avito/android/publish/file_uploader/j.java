package com.avito.android.publish.file_uploader;

import fe0.InterfaceC40409b;
import kotlin.Metadata;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<InterfaceC40409b> f235691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f235692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f235693d;

    public j(io.reactivex.rxjava3.subjects.e<InterfaceC40409b> eVar, String str, String str2) {
        this.f235691b = eVar;
        this.f235692c = str;
        this.f235693d = str2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f235691b.onNext(new InterfaceC40409b.C11163b(this.f235692c, this.f235693d));
    }
}
