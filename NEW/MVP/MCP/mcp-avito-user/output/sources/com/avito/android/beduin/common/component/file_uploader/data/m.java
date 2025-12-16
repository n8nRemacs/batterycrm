package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.beduin.common.component.file_uploader.x;
import kotlin.Metadata;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<x> f101260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f101261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f101262d;

    public m(io.reactivex.rxjava3.subjects.e<x> eVar, String str, String str2) {
        this.f101260b = eVar;
        this.f101261c = str;
        this.f101262d = str2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f101260b.onNext(new x.b(this.f101261c, this.f101262d));
    }
}
