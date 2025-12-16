package com.avito.android.api.converter;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import gd.InterfaceC40661a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import uv.C49116a;

/* compiled from: Converter.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "R", "T", "vacancyId", "", "fromPage", "disclaimerPDViewed", "", "customFlowName", "context", "call", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b<T> implements InterfaceC40661a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40661a<T> f91304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C49116a f91305b;

    /* compiled from: Converter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.api.converter.ConverterKt$withConverter$1", f = "Converter.kt", i = {0}, l = {15}, m = "call", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f91306q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f91307r;

        /* renamed from: t, reason: collision with root package name */
        public int f91309t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91307r = obj;
            this.f91309t |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(null, null, null, null, null, this);
        }
    }

    public b(InterfaceC40661a interfaceC40661a, C49116a c49116a) {
        this.f91304a = interfaceC40661a;
        this.f91305b = c49116a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // gd.InterfaceC40661a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r10, @Y61.l java.lang.Boolean r11, @Y61.k java.lang.String r12, @Y61.l java.lang.String r13, @Y61.l java.lang.String r14, @Y61.k kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.api.converter.b.a(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
