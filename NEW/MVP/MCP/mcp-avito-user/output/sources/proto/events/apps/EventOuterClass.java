package proto.events.apps;

import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.AbstractC37708x;
import com.google.protobuf.C37694p0;
import com.google.protobuf.C37696q0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC37709x0;
import com.google.protobuf.L0;
import com.google.protobuf.M;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes9.dex */
public final class EventOuterClass {

    public static final class Event extends GeneratedMessageLite<Event, a> implements b {
        private static final Event DEFAULT_INSTANCE;
        public static final int ENV_FIELD_NUMBER = 5;
        public static final int EVENTID_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 4;
        private static volatile L0<Event> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private C37696q0<String, String> env_;
        private int eventId_;
        private C37696q0<String, String> params_;
        private int version_;

        public static final class a extends GeneratedMessageLite.b<Event, a> implements b {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public final void s(String str, String str2) {
                str2.getClass();
                n();
                ((Event) this.f362681c).getMutableEnvMap().put(str, str2);
            }

            public a() {
                super(Event.DEFAULT_INSTANCE);
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final C37694p0<String, String> f428819a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.f362797l;
                f428819a = new C37694p0<>(fieldType, fieldType, "");
            }
        }

        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public static final C37694p0<String, String> f428820a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.f362797l;
                f428820a = new C37694p0<>(fieldType, fieldType, "");
            }
        }

        static {
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            GeneratedMessageLite.registerDefaultInstance(Event.class, event);
        }

        private Event() {
            C37696q0 c37696q0 = C37696q0.f362942c;
            this.params_ = c37696q0;
            this.env_ = c37696q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableEnvMap() {
            return internalGetMutableEnv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        private C37696q0<String, String> internalGetEnv() {
            return this.env_;
        }

        private C37696q0<String, String> internalGetMutableEnv() {
            C37696q0<String, String> c37696q0 = this.env_;
            if (!c37696q0.f362943b) {
                this.env_ = c37696q0.k();
            }
            return this.env_;
        }

        private C37696q0<String, String> internalGetMutableParams() {
            C37696q0<String, String> c37696q0 = this.params_;
            if (!c37696q0.f362943b) {
                this.params_ = c37696q0.k();
            }
            return this.params_;
        }

        private C37696q0<String, String> internalGetParams() {
            return this.params_;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static L0<Event> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(int i12) {
            this.eventId_ = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i12) {
            this.version_ = i12;
        }

        public boolean containsEnv(String str) {
            str.getClass();
            return internalGetEnv().containsKey(str);
        }

        public boolean containsParams(String str) {
            str.getClass();
            return internalGetParams().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            a aVar = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0002\u0000\u0000\u0001\u0004\u0002\u0004\u00042\u00052", new Object[]{"eventId_", "version_", "params_", c.f428820a, "env_", b.f428819a});
                case 3:
                    return new Event();
                case 4:
                    return new a(aVar);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    L0<Event> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (Event.class) {
                            try {
                                cVar = PARSER;
                                if (cVar == null) {
                                    cVar = new GeneratedMessageLite.c<>(DEFAULT_INSTANCE);
                                    PARSER = cVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return cVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Deprecated
        public Map<String, String> getEnv() {
            return getEnvMap();
        }

        public int getEnvCount() {
            return internalGetEnv().size();
        }

        public Map<String, String> getEnvMap() {
            return Collections.unmodifiableMap(internalGetEnv());
        }

        public String getEnvOrDefault(String str, String str2) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetEnv = internalGetEnv();
            return c37696q0InternalGetEnv.containsKey(str) ? c37696q0InternalGetEnv.get(str) : str2;
        }

        public String getEnvOrThrow(String str) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetEnv = internalGetEnv();
            if (c37696q0InternalGetEnv.containsKey(str)) {
                return c37696q0InternalGetEnv.get(str);
            }
            throw new IllegalArgumentException();
        }

        public int getEventId() {
            return this.eventId_;
        }

        @Deprecated
        public Map<String, String> getParams() {
            return getParamsMap();
        }

        public int getParamsCount() {
            return internalGetParams().size();
        }

        public Map<String, String> getParamsMap() {
            return Collections.unmodifiableMap(internalGetParams());
        }

        public String getParamsOrDefault(String str, String str2) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetParams = internalGetParams();
            return c37696q0InternalGetParams.containsKey(str) ? c37696q0InternalGetParams.get(str) : str2;
        }

        public String getParamsOrThrow(String str) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetParams = internalGetParams();
            if (c37696q0InternalGetParams.containsKey(str)) {
                return c37696q0InternalGetParams.get(str);
            }
            throw new IllegalArgumentException();
        }

        public int getVersion() {
            return this.version_;
        }

        public static a newBuilder(Event event) {
            return DEFAULT_INSTANCE.createBuilder(event);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, M m12) {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, M m12) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
        }

        public static Event parseFrom(AbstractC37700t abstractC37700t) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
        }

        public static Event parseFrom(AbstractC37700t abstractC37700t, M m12) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
        }

        public static Event parseFrom(byte[] bArr) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Event parseFrom(byte[] bArr, M m12) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
        }

        public static Event parseFrom(InputStream inputStream) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, M m12) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
        }

        public static Event parseFrom(AbstractC37708x abstractC37708x) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
        }

        public static Event parseFrom(AbstractC37708x abstractC37708x, M m12) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f428821a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f428821a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f428821a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f428821a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f428821a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f428821a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f428821a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f428821a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface b extends InterfaceC37709x0 {
    }
}
