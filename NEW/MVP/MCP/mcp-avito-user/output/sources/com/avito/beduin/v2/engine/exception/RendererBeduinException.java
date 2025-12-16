package com.avito.beduin.v2.engine.exception;

import AK.c;
import Y61.k;
import Y61.l;
import YT0.b;
import androidx.appcompat.app.r;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: RendererBeduinException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/RendererBeduinException;", "Lcom/avito/beduin/v2/engine/exception/AbstractBeduinException;", "OnBindStateException", "UnregisteredComponentException", "Lcom/avito/beduin/v2/engine/exception/RendererBeduinException$OnBindStateException;", "Lcom/avito/beduin/v2/engine/exception/RendererBeduinException$UnregisteredComponentException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RendererBeduinException extends AbstractBeduinException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinExceptionType f336733b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f336734c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f336735d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Throwable f336736e;

    /* compiled from: RendererBeduinException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/RendererBeduinException$OnBindStateException;", "Lcom/avito/beduin/v2/engine/exception/RendererBeduinException;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnBindStateException extends RendererBeduinException {

        /* renamed from: g, reason: collision with root package name */
        @k
        public static final a f336737g = new a(null);

        /* renamed from: f, reason: collision with root package name */
        @k
        public final Object f336738f;

        /* compiled from: RendererBeduinException.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/RendererBeduinException$OnBindStateException$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public OnBindStateException(@l String str, @k Object obj, @l String str2, @l YT0.a aVar, @k Exception exc) {
            b f175484a;
            BeduinExceptionType beduinExceptionType = BeduinExceptionType.f336714l;
            StringBuilder sb2 = new StringBuilder();
            f336737g.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            String strA = str2 != null ? C22491k0.a('}', "{", str2) : null;
            sb3.append(strA == null ? "" : strA);
            sb2.append(sb3.toString());
            sb2.append("<->");
            Class<?> cls = obj.getClass();
            n0 n0Var = m0.f406844a;
            sb2.append(n0Var.b(cls).l0());
            String string = sb2.toString();
            StringBuilder sbA = r.A("\"", str, "\" failed to bind state: ");
            sbA.append((aVar == null || (f175484a = aVar.getF175484a()) == null || !f175484a.f19477a) ? n0Var.b(obj.getClass()).l0() : obj);
            super(beduinExceptionType, string, sbA.toString(), exc, null);
            this.f336738f = obj;
        }
    }

    /* compiled from: RendererBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/RendererBeduinException$UnregisteredComponentException;", "Lcom/avito/beduin/v2/engine/exception/RendererBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnregisteredComponentException extends RendererBeduinException {
        public UnregisteredComponentException(@k String str) {
            super(BeduinExceptionType.f336715m, str, c.k("ComponentFactory for \"", str, "\" isn't registered in RendererContext"), null, null);
        }
    }

    public RendererBeduinException(BeduinExceptionType beduinExceptionType, String str, String str2, Throwable th2, C42822w c42822w) {
        super(str2, th2, null);
        this.f336733b = beduinExceptionType;
        this.f336734c = str;
        this.f336735d = str2;
        this.f336736e = th2;
    }

    @Override // com.avito.beduin.v2.engine.exception.BeduinException
    @k
    /* renamed from: a, reason: from getter */
    public final BeduinExceptionType getF336719b() {
        return this.f336733b;
    }

    @Override // com.avito.beduin.v2.engine.exception.BeduinException
    @k
    /* renamed from: b, reason: from getter */
    public final String getF336720c() {
        return this.f336734c;
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f336736e;
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f336735d;
    }
}
