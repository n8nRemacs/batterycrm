package ru.cyberity.cbr.camera.photo.presentation.document;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DocCapture.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture;", "", "<init>", "()V", "PreferredMode", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class DocCapture {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final DocCapture f432341a = new DocCapture();

    /* compiled from: DocCapture.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "MANUAL", "AUTO", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public enum PreferredMode {
        MANUAL("m"),
        AUTO("a");


        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        @k
        private final String value;

        /* compiled from: DocCapture.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode$a;", "", "", "value", "Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.camera.photo.presentation.document.DocCapture$PreferredMode$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @l
            public final PreferredMode a(@k String value) {
                for (PreferredMode preferredMode : PreferredMode.values()) {
                    if (L.f(preferredMode.getValue(), value)) {
                        return preferredMode;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        PreferredMode(String str) {
            this.value = str;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    private DocCapture() {
    }
}
