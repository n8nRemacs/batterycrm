package com.yandex.div.json.expressions;

import Y61.k;
import Y61.l;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.F;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.i;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExpressionResolver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/expressions/e;", "", "b", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final a f370568a;

    /* compiled from: ExpressionResolver.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/json/expressions/e$a", "Lcom/yandex/div/json/expressions/e;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements e {
        @Override // com.yandex.div.json.expressions.e
        @k
        public final InterfaceC37911f a(@k String str, @k List<String> list, @k Y41.a<G0> aVar) {
            return InterfaceC37911f.f367528l2;
        }

        @Override // com.yandex.div.json.expressions.e
        @l
        public final <R, T> T b(@k String str, @k String str2, @k com.yandex.div.evaluable.a aVar, @l Y41.l<? super R, ? extends T> lVar, @k F<T> f12, @k D<T> d12, @k i iVar) {
            return null;
        }
    }

    /* compiled from: ExpressionResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/json/expressions/e$b;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/e;", "EMPTY", "Lcom/yandex/div/json/expressions/e;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f370569a = 0;

        static {
            new b();
        }
    }

    static {
        int i12 = b.f370569a;
        f370568a = new a();
    }

    @k
    InterfaceC37911f a(@k String str, @k List<String> list, @k Y41.a<G0> aVar);

    @l
    <R, T> T b(@k String str, @k String str2, @k com.yandex.div.evaluable.a aVar, @l Y41.l<? super R, ? extends T> lVar, @k F<T> f12, @k D<T> d12, @k i iVar);

    default void c(@k ParsingException parsingException) {
    }
}
