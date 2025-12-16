package io.ktor.websocket.serialization;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.serialization.h;
import io.ktor.websocket.AbstractC41723i;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.m0;
import kotlin.reflect.r;

/* compiled from: WebsocketChannelSerialization.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {95, 104}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", "charset", "typeInfo", "frame"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public U31.b f401622q;

    /* renamed from: r, reason: collision with root package name */
    public Object f401623r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401624s;

    /* renamed from: t, reason: collision with root package name */
    public int f401625t;

    public a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws WebsocketDeserializeException {
        this.f401624s = obj;
        this.f401625t = (this.f401625t | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401625t;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 == 1) {
            h hVar = (h) this.f401623r;
            U31.b bVar = this.f401622q;
            C42729a0.b(obj);
            AbstractC41723i abstractC41723i = (AbstractC41723i) obj;
            if (!hVar.b(abstractC41723i)) {
                throw new WebsocketDeserializeException("Converter doesn't support frame type " + abstractC41723i.f401558b.name(), null, abstractC41723i, 2, null);
            }
            this.f401622q = bVar;
            this.f401623r = abstractC41723i;
            this.f401625t = 2;
            hVar.a(abstractC41723i);
            throw null;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC41723i abstractC41723i2 = (AbstractC41723i) this.f401623r;
        U31.b bVar2 = this.f401622q;
        C42729a0.b(obj);
        if (bVar2.f16154a.n0(obj)) {
            return obj;
        }
        if (obj == null) {
            r rVar = bVar2.f16156c;
            if (rVar == null || !rVar.d()) {
                throw new WebsocketDeserializeException("Frame has null content", null, abstractC41723i2, 2, null);
            }
            return null;
        }
        throw new WebsocketDeserializeException("Can't deserialize value: expected value of type " + bVar2.f16154a.l0() + ", got " + m0.f406844a.b(obj.getClass()).l0(), null, abstractC41723i2, 2, null);
    }
}
