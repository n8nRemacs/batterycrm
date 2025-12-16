package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.InterfaceC33140y2;
import com.avito.android.persistence.messenger.UserEntityType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Completables.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.video.chunked_upload.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32305d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f194930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f194931c;

    public C32305d(f fVar, AbstractC32094s0.b bVar) {
        this.f194930b = fVar;
        this.f194931c = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC33140y2 interfaceC33140y2 = this.f194930b.f194935c;
        AbstractC32094s0.b bVar = this.f194931c;
        MessengerUserHashInfo messengerUserHashInfo = bVar.f191222b;
        String str = messengerUserHashInfo.f430682d;
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return interfaceC33140y2.b(str, bVar.f191223c, bVar.f191221a, bVar.f191224d, userEntityTypeG).S();
    }
}
