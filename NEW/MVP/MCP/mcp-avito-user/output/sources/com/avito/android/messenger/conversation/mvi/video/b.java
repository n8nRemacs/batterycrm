package com.avito.android.messenger.conversation.mvi.video;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoCompressor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b;", "", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: VideoCompressor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$a;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/video/b$a$a;", "Lcom/avito/android/messenger/conversation/mvi/video/b$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends Throwable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f194884b;

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$a$a;", "Lcom/avito/android/messenger/conversation/mvi/video/b$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.b$a$a, reason: collision with other inner class name */
        public static final class C5754a extends a {

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final C5754a f194885c = new C5754a();

            public C5754a() {
                super(null, null);
            }
        }

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$a$b;", "Lcom/avito/android/messenger/conversation/mvi/video/b$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.b$a$b, reason: collision with other inner class name */
        public static final class C5755b extends a {
        }

        public a(Throwable th2, C42822w c42822w) {
            this.f194884b = th2;
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final Throwable getCause() {
            return this.f194884b;
        }
    }

    /* compiled from: VideoCompressor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/video/b$b$a;", "Lcom/avito/android/messenger/conversation/mvi/video/b$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.video.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC5756b {

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$b$a;", "Lcom/avito/android/messenger/conversation/mvi/video/b$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.b$b$a */
        public static final class a extends AbstractC5756b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f194886a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$b$b;", "Lcom/avito/android/messenger/conversation/mvi/video/b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5757b extends AbstractC5756b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final File f194887a;

            public C5757b(@Y61.k File file) {
                super(null);
                this.f194887a = file;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5757b) && L.f(this.f194887a, ((C5757b) obj).f194887a);
            }

            public final int hashCode() {
                return this.f194887a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(compressedFile=" + this.f194887a + ')';
            }
        }

        public /* synthetic */ AbstractC5756b(C42822w c42822w) {
            this();
        }

        public AbstractC5756b() {
        }
    }

    @Y61.k
    O a(@Y61.k Uri uri, @Y61.k File file);
}
