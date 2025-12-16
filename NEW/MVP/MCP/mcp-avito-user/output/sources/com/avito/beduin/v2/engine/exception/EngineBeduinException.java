package com.avito.beduin.v2.engine.exception;

import AK.c;
import Y61.k;
import Y61.l;
import aU0.C19817a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: EngineBeduinException.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "Lcom/avito/beduin/v2/engine/exception/AbstractBeduinException;", "BeduinFunctionException", "BeduinMetaFunctionException", "a", "ComponentException", "ComponentPropertyException", "CreateComponentException", "EngineContextException", "InteractionException", "UnregisteredComponentStateFactoryException", "UnregisteredFunctionException", "UnregisteredInteractionException", "UnregisteredInteractionHandlerException", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$BeduinFunctionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$BeduinMetaFunctionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$ComponentException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$EngineContextException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$InteractionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredComponentStateFactoryException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredFunctionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredInteractionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredInteractionHandlerException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class EngineBeduinException extends AbstractBeduinException {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f336718f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinExceptionType f336719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f336720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f336721d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Throwable f336722e;

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$BeduinFunctionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class BeduinFunctionException extends EngineBeduinException {

        /* renamed from: g, reason: collision with root package name */
        @k
        public static final a f336723g = new a(null);

        /* compiled from: EngineBeduinException.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$BeduinFunctionException$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public /* synthetic */ BeduinFunctionException(String str, Throwable th2, String str2, C42822w c42822w) {
            this(str, str2, th2);
        }

        public /* synthetic */ BeduinFunctionException(String str, Throwable th2, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 4) != 0 ? null : str2, th2);
        }

        public BeduinFunctionException(String str, String str2, Throwable th2) {
            super(BeduinExceptionType.f336712j, C19817a.a(str, str2), "`" + C19817a.a(str, str2) + "` function failed", th2, null);
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$BeduinMetaFunctionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BeduinMetaFunctionException extends EngineBeduinException {
        public BeduinMetaFunctionException(@k String str, @k Exception exc) {
            super(BeduinExceptionType.f336713k, str, c.k("`", str, "` meta function failed"), exc, null);
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$ComponentException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$ComponentPropertyException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$CreateComponentException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ComponentException extends EngineBeduinException {

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f336724g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f336725h;

        public /* synthetic */ ComponentException(String str, String str2, String str3, Throwable th2, BeduinExceptionType beduinExceptionType, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, th2, beduinExceptionType, null);
        }

        public ComponentException(String str, String str2, String str3, Throwable th2, BeduinExceptionType beduinExceptionType, C42822w c42822w) {
            String message;
            String strB = C19817a.b(str, str2, str3);
            StringBuilder sb2 = new StringBuilder("Error in \"");
            sb2.append(C19817a.b(str, str2, str3));
            sb2.append("\": ");
            EngineBeduinException.f336718f.getClass();
            if (th2 != null) {
                message = th2.getMessage();
                if (message == null) {
                    message = m0.f406844a.b(th2.getClass()).l0();
                }
            } else {
                message = null;
            }
            sb2.append(message == null ? "" : message);
            super(beduinExceptionType, strB, sb2.toString(), th2, null);
            this.f336724g = str;
            this.f336725h = str2;
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$ComponentPropertyException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$ComponentException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ComponentPropertyException extends ComponentException {
        public /* synthetic */ ComponentPropertyException(String str, String str2, String str3, Throwable th2, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, th2);
        }

        public ComponentPropertyException(@k String str, @k String str2, @l String str3, @k Throwable th2) {
            super(str, str2, str3, th2, BeduinExceptionType.f336710h, null);
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$CreateComponentException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$ComponentException;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreateComponentException extends ComponentException {

        /* renamed from: i, reason: collision with root package name */
        @k
        public static final a f336726i = new a(null);

        /* compiled from: EngineBeduinException.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$CreateComponentException$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public /* synthetic */ CreateComponentException(String str, String str2, String str3, Throwable th2, C42822w c42822w) {
            this(str, str2, str3, th2);
        }

        public /* synthetic */ CreateComponentException(String str, String str2, String str3, Throwable th2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, th2);
        }

        public CreateComponentException(String str, String str2, String str3, Throwable th2) {
            super(str, str2, str3, th2, BeduinExceptionType.f336709g, null);
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$EngineContextException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineContextException extends EngineBeduinException {
        public EngineContextException(@k String str) {
            super(BeduinExceptionType.f336711i, "EngineContext", str, null, null);
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$InteractionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InteractionException extends EngineBeduinException {

        /* renamed from: i, reason: collision with root package name */
        @k
        public static final a f336727i = new a(null);

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f336728g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f336729h;

        /* compiled from: EngineBeduinException.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$InteractionException$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @k
            public static InteractionException a(@k String str, @k Throwable th2) {
                C42822w c42822w = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (!(th2 instanceof BeduinPropertyException)) {
                    return new InteractionException(str, objArr2 == true ? 1 : 0, th2, objArr == true ? 1 : 0);
                }
                BeduinPropertyException beduinPropertyException = (BeduinPropertyException) th2;
                return new InteractionException(str, beduinPropertyException.f336863b, beduinPropertyException.f336864c, c42822w);
            }

            public a() {
            }
        }

        public /* synthetic */ InteractionException(String str, String str2, Throwable th2, C42822w c42822w) {
            this(str, str2, th2);
        }

        public /* synthetic */ InteractionException(String str, String str2, Throwable th2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, th2);
        }

        public InteractionException(String str, String str2, Throwable th2) {
            super(BeduinExceptionType.f336708f, C19817a.a(str, str2), "Error in \"" + C19817a.a(str, str2) + "\" interaction", th2, null);
            this.f336728g = str;
            this.f336729h = str2;
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredComponentStateFactoryException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnregisteredComponentStateFactoryException extends EngineBeduinException {
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredFunctionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnregisteredFunctionException extends EngineBeduinException {
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredInteractionException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnregisteredInteractionException extends EngineBeduinException {

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f336730g;

        public UnregisteredInteractionException(@k String str) {
            super(BeduinExceptionType.f336706d, str, c.k("InteractionFactory for \"", str, "\" isn't registered in EngineContext"), null, null);
            this.f336730g = str;
        }
    }

    /* compiled from: EngineBeduinException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$UnregisteredInteractionHandlerException;", "Lcom/avito/beduin/v2/engine/exception/EngineBeduinException;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnregisteredInteractionHandlerException extends EngineBeduinException {
    }

    /* compiled from: EngineBeduinException.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/exception/EngineBeduinException$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public EngineBeduinException(BeduinExceptionType beduinExceptionType, String str, String str2, Throwable th2, C42822w c42822w) {
        super(str2, th2, null);
        this.f336719b = beduinExceptionType;
        this.f336720c = str;
        this.f336721d = str2;
        this.f336722e = th2;
    }

    @Override // com.avito.beduin.v2.engine.exception.BeduinException
    @k
    /* renamed from: a, reason: from getter */
    public final BeduinExceptionType getF336733b() {
        return this.f336719b;
    }

    @Override // com.avito.beduin.v2.engine.exception.BeduinException
    @k
    /* renamed from: b, reason: from getter */
    public final String getF336734c() {
        return this.f336720c;
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f336722e;
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f336721d;
    }
}
