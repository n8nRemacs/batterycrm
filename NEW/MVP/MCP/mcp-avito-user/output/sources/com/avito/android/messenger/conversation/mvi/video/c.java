package com.avito.android.messenger.conversation.mvi.video;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.C42002z0;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoCompressor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/c;", "Lcom/avito/android/messenger/conversation/mvi/video/b;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f194889b;

    /* compiled from: VideoCompressor.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/c$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/video/c$a$a;", "Lcom/avito/android/messenger/conversation/mvi/video/c$a$b;", "Lcom/avito/android/messenger/conversation/mvi/video/c$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/c$a$a;", "Lcom/avito/android/messenger/conversation/mvi/video/c$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.c$a$a, reason: collision with other inner class name */
        public static final class C5758a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5758a f194890a = new C5758a();

            public C5758a() {
                super(null);
            }
        }

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/c$a$b;", "Lcom/avito/android/messenger/conversation/mvi/video/c$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f194891a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: VideoCompressor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/c$a$c;", "Lcom/avito/android/messenger/conversation/mvi/video/c$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C5759c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final File f194892a;

            public C5759c(@Y61.k File file) {
                super(null);
                this.f194892a = file;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5759c) && L.f(this.f194892a, ((C5759c) obj).f194892a);
            }

            public final int hashCode() {
                return this.f194892a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(compressedFile=" + this.f194892a + ')';
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public c(@Y61.k Context context, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f194888a = interfaceC35745a5;
        this.f194889b = context;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.b
    @Y61.k
    public final O a(@Y61.k Uri uri, @Y61.k File file) {
        C c12 = new C(new FX0.b(uri, file, this, 13));
        InterfaceC35745a5 interfaceC35745a5 = this.f194888a;
        return new C42002z0(c12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.a()).E0(20L, TimeUnit.SECONDS, null, io.reactivex.rxjava3.schedulers.b.f404942b)).r(e.f194996b);
    }
}
