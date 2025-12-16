package com.avito.android.publish.objects;

import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.adverts.PretendAdvertResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ObjectFillFormInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/PretendResult;", "result", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33959m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C33959m<T, R> f238053b = new C33959m<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        PretendAdvertResult pretendAdvertResult = (PretendAdvertResult) obj;
        if (pretendAdvertResult instanceof PretendAdvertResult.Ok) {
            return new PretendResult(true, null, 2, null);
        }
        if (pretendAdvertResult instanceof PretendAdvertResult.InputErrors) {
            return ((PretendAdvertResult.InputErrors) pretendAdvertResult).getMessages();
        }
        throw new NoWhenBranchMatchedException();
    }
}
