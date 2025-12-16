package proto.events.apps;

import com.google.protobuf.AbstractC37663a;
import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.AbstractC37708x;
import com.google.protobuf.C37670d0;
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
import java.util.List;
import java.util.Map;
import proto.events.apps.EventOuterClass;

/* loaded from: classes9.dex */
public final class BatchOuterClass {

    public static final class Envelope extends GeneratedMessageLite<Envelope, a> implements b {
        public static final int COMMON_FIELD_NUMBER = 3;
        private static final Envelope DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 4;
        public static final int META_FIELD_NUMBER = 2;
        private static volatile L0<Envelope> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private C37696q0<String, String> common_;
        private C37670d0.k<EventOuterClass.Event> events_;
        private C37696q0<String, String> meta_;
        private int version_;

        public static final class a extends GeneratedMessageLite.b<Envelope, a> implements b {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public final void s(String str, String str2) {
                str2.getClass();
                n();
                ((Envelope) this.f362681c).getMutableCommonMap().put(str, str2);
            }

            public final void t(String str, String str2) {
                str2.getClass();
                n();
                ((Envelope) this.f362681c).getMutableMetaMap().put(str, str2);
            }

            public a() {
                super(Envelope.DEFAULT_INSTANCE);
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final C37694p0<String, String> f428816a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.f362797l;
                f428816a = new C37694p0<>(fieldType, fieldType, "");
            }
        }

        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public static final C37694p0<String, String> f428817a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.f362797l;
                f428817a = new C37694p0<>(fieldType, fieldType, "");
            }
        }

        static {
            Envelope envelope = new Envelope();
            DEFAULT_INSTANCE = envelope;
            GeneratedMessageLite.registerDefaultInstance(Envelope.class, envelope);
        }

        private Envelope() {
            C37696q0 c37696q0 = C37696q0.f362942c;
            this.meta_ = c37696q0;
            this.common_ = c37696q0;
            this.events_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEvents(Iterable<? extends EventOuterClass.Event> iterable) {
            ensureEventsIsMutable();
            AbstractC37663a.addAll((Iterable) iterable, (List) this.events_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(EventOuterClass.Event event) {
            event.getClass();
            ensureEventsIsMutable();
            this.events_.add(event);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        private void ensureEventsIsMutable() {
            C37670d0.k<EventOuterClass.Event> kVar = this.events_;
            if (kVar.isModifiable()) {
                return;
            }
            this.events_ = GeneratedMessageLite.mutableCopy(kVar);
        }

        public static Envelope getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableCommonMap() {
            return internalGetMutableCommon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableMetaMap() {
            return internalGetMutableMeta();
        }

        private C37696q0<String, String> internalGetCommon() {
            return this.common_;
        }

        private C37696q0<String, String> internalGetMeta() {
            return this.meta_;
        }

        private C37696q0<String, String> internalGetMutableCommon() {
            C37696q0<String, String> c37696q0 = this.common_;
            if (!c37696q0.f362943b) {
                this.common_ = c37696q0.k();
            }
            return this.common_;
        }

        private C37696q0<String, String> internalGetMutableMeta() {
            C37696q0<String, String> c37696q0 = this.meta_;
            if (!c37696q0.f362943b) {
                this.meta_ = c37696q0.k();
            }
            return this.meta_;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Envelope parseDelimitedFrom(InputStream inputStream) {
            return (Envelope) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Envelope parseFrom(ByteBuffer byteBuffer) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static L0<Envelope> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEvents(int i12) {
            ensureEventsIsMutable();
            this.events_.remove(i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(int i12, EventOuterClass.Event event) {
            event.getClass();
            ensureEventsIsMutable();
            this.events_.set(i12, event);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i12) {
            this.version_ = i12;
        }

        public boolean containsCommon(String str) {
            str.getClass();
            return internalGetCommon().containsKey(str);
        }

        public boolean containsMeta(String str) {
            str.getClass();
            return internalGetMeta().containsKey(str);
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0002\u0001\u0000\u0001\u0004\u00022\u00032\u0004\u001b", new Object[]{"version_", "meta_", c.f428817a, "common_", b.f428816a, "events_", EventOuterClass.Event.class});
                case 3:
                    return new Envelope();
                case 4:
                    return new a(aVar);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    L0<Envelope> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (Envelope.class) {
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
        public Map<String, String> getCommon() {
            return getCommonMap();
        }

        public int getCommonCount() {
            return internalGetCommon().size();
        }

        public Map<String, String> getCommonMap() {
            return Collections.unmodifiableMap(internalGetCommon());
        }

        public String getCommonOrDefault(String str, String str2) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetCommon = internalGetCommon();
            return c37696q0InternalGetCommon.containsKey(str) ? c37696q0InternalGetCommon.get(str) : str2;
        }

        public String getCommonOrThrow(String str) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetCommon = internalGetCommon();
            if (c37696q0InternalGetCommon.containsKey(str)) {
                return c37696q0InternalGetCommon.get(str);
            }
            throw new IllegalArgumentException();
        }

        public EventOuterClass.Event getEvents(int i12) {
            return this.events_.get(i12);
        }

        public int getEventsCount() {
            return this.events_.size();
        }

        public List<EventOuterClass.Event> getEventsList() {
            return this.events_;
        }

        public EventOuterClass.b getEventsOrBuilder(int i12) {
            return this.events_.get(i12);
        }

        public List<? extends EventOuterClass.b> getEventsOrBuilderList() {
            return this.events_;
        }

        @Deprecated
        public Map<String, String> getMeta() {
            return getMetaMap();
        }

        public int getMetaCount() {
            return internalGetMeta().size();
        }

        public Map<String, String> getMetaMap() {
            return Collections.unmodifiableMap(internalGetMeta());
        }

        public String getMetaOrDefault(String str, String str2) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetMeta = internalGetMeta();
            return c37696q0InternalGetMeta.containsKey(str) ? c37696q0InternalGetMeta.get(str) : str2;
        }

        public String getMetaOrThrow(String str) {
            str.getClass();
            C37696q0<String, String> c37696q0InternalGetMeta = internalGetMeta();
            if (c37696q0InternalGetMeta.containsKey(str)) {
                return c37696q0InternalGetMeta.get(str);
            }
            throw new IllegalArgumentException();
        }

        public int getVersion() {
            return this.version_;
        }

        public static a newBuilder(Envelope envelope) {
            return DEFAULT_INSTANCE.createBuilder(envelope);
        }

        public static Envelope parseDelimitedFrom(InputStream inputStream, M m12) {
            return (Envelope) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, m12);
        }

        public static Envelope parseFrom(ByteBuffer byteBuffer, M m12) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, m12);
        }

        public static Envelope parseFrom(AbstractC37700t abstractC37700t) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(int i12, EventOuterClass.Event event) {
            event.getClass();
            ensureEventsIsMutable();
            this.events_.add(i12, event);
        }

        public static Envelope parseFrom(AbstractC37700t abstractC37700t, M m12) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37700t, m12);
        }

        public static Envelope parseFrom(byte[] bArr) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Envelope parseFrom(byte[] bArr, M m12) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, m12);
        }

        public static Envelope parseFrom(InputStream inputStream) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Envelope parseFrom(InputStream inputStream, M m12) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, m12);
        }

        public static Envelope parseFrom(AbstractC37708x abstractC37708x) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x);
        }

        public static Envelope parseFrom(AbstractC37708x abstractC37708x, M m12) {
            return (Envelope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC37708x, m12);
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f428818a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f428818a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f428818a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f428818a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f428818a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f428818a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f428818a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f428818a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface b extends InterfaceC37709x0 {
    }
}
