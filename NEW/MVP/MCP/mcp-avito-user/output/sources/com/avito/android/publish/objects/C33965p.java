package com.avito.android.publish.objects;

import com.avito.android.remote.model.PretendResult;
import kotlin.Metadata;

/* compiled from: ObjectFillFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/PretendResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.objects.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33965p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33967q f238059b;

    public C33965p(C33967q c33967q) {
        this.f238059b = c33967q;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f238059b.f238071l.applyPretendResult(((PretendResult) obj).getErrors());
    }
}
