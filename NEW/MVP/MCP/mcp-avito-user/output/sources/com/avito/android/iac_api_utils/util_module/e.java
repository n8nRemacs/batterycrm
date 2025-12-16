package com.avito.android.iac_api_utils.util_module;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: IacApiTracker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f164309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f164311d;

    public e(b bVar, String str, String[] strArr) {
        this.f164309b = bVar;
        this.f164310c = str;
        this.f164311d = strArr;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String[] strArr = this.f164311d;
        this.f164309b.e(this.f164310c, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
