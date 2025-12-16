package com.avito.android.publish.objects;

import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ObjectFillFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/PretendResult;", "result", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33961n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33967q f238055b;

    public C33961n(C33967q c33967q) {
        this.f238055b = c33967q;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map<String, PretendErrorValue> mapC;
        Map<Integer, Map<String, PretendErrorValue>> objectsErrorParams;
        Map<String, PretendErrorValue> errors = ((PretendResult) obj).getErrors();
        C33967q c33967q = this.f238055b;
        PretendErrorValue pretendErrorValue = errors.get(c33967q.a().getId());
        PretendErrorValue.ObjectsMessages objectsMessages = pretendErrorValue instanceof PretendErrorValue.ObjectsMessages ? (PretendErrorValue.ObjectsMessages) pretendErrorValue : null;
        if (objectsMessages == null || (objectsErrorParams = objectsMessages.getObjectsErrorParams()) == null || (mapC = objectsErrorParams.get(Integer.valueOf(c33967q.f238070k))) == null) {
            mapC = kotlin.collections.P0.c();
        }
        return new PretendResult(mapC.isEmpty(), mapC);
    }
}
