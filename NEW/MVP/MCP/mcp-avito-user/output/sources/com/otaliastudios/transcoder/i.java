package com.otaliastudios.transcoder;

import android.os.Handler;
import android.os.Looper;
import com.otaliastudios.transcoder.internal.utils.l;
import com.otaliastudios.transcoder.strategy.a;
import com.otaliastudios.transcoder.strategy.c;
import j.N;
import java.util.ArrayList;
import java.util.concurrent.Future;
import v11.C49143b;

/* compiled from: TranscoderOptions.java */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public com.otaliastudios.transcoder.sink.b f365982a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f365983b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f365984c;

    /* renamed from: d, reason: collision with root package name */
    public com.otaliastudios.transcoder.strategy.a f365985d;

    /* renamed from: e, reason: collision with root package name */
    public com.otaliastudios.transcoder.strategy.f f365986e;

    /* renamed from: f, reason: collision with root package name */
    public com.otaliastudios.transcoder.validator.a f365987f;

    /* renamed from: g, reason: collision with root package name */
    public com.otaliastudios.transcoder.time.a f365988g;

    /* renamed from: h, reason: collision with root package name */
    public y11.c f365989h;

    /* renamed from: i, reason: collision with root package name */
    public C49143b f365990i;

    /* renamed from: j, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.video.d f365991j;

    /* renamed from: k, reason: collision with root package name */
    public Handler f365992k;

    /* compiled from: TranscoderOptions.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.otaliastudios.transcoder.sink.b f365993a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f365994b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f365995c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public com.avito.android.messenger.conversation.mvi.video.d f365996d;

        /* renamed from: e, reason: collision with root package name */
        public Handler f365997e;

        /* renamed from: f, reason: collision with root package name */
        public com.otaliastudios.transcoder.strategy.a f365998f;

        /* renamed from: g, reason: collision with root package name */
        public com.otaliastudios.transcoder.strategy.f f365999g;

        /* renamed from: h, reason: collision with root package name */
        public com.otaliastudios.transcoder.validator.a f366000h;

        /* renamed from: i, reason: collision with root package name */
        public com.otaliastudios.transcoder.time.a f366001i;

        /* renamed from: j, reason: collision with root package name */
        public y11.c f366002j;

        /* renamed from: k, reason: collision with root package name */
        public C49143b f366003k;

        public b(@N String str) {
            this.f365993a = new com.otaliastudios.transcoder.sink.b(str);
        }

        @N
        public final Future<Void> a() {
            new g();
            if (this.f365996d == null) {
                throw new IllegalStateException("listener can't be null");
            }
            ArrayList arrayList = this.f365994b;
            boolean zIsEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f365995c;
            if (zIsEmpty && arrayList2.isEmpty()) {
                throw new IllegalStateException("we need at least one data source");
            }
            if (this.f365997e == null) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    looperMyLooper = Looper.getMainLooper();
                }
                this.f365997e = new Handler(looperMyLooper);
            }
            if (this.f365998f == null) {
                new a.b();
                a.c cVar = new a.c();
                cVar.f366263a = -1;
                cVar.f366264b = -1;
                cVar.f366266d = "audio/mp4a-latm";
                cVar.f366265c = Long.MIN_VALUE;
                com.otaliastudios.transcoder.strategy.a aVar = new com.otaliastudios.transcoder.strategy.a();
                aVar.f366262a = cVar;
                this.f365998f = aVar;
            }
            if (this.f365999g == null) {
                w11.c cVar2 = new w11.c();
                c.b bVar = new c.b();
                w11.e eVar = new w11.e();
                bVar.f366268a = 30;
                bVar.f366269b = Long.MIN_VALUE;
                bVar.f366270c = 3.0f;
                eVar.f441154a.add(cVar2);
                bVar.f366269b = 2000000L;
                bVar.f366268a = 30;
                bVar.f366270c = 3.0f;
                c.C10806c c10806c = new c.C10806c();
                c10806c.f366271a = eVar;
                c10806c.f366273c = bVar.f366268a;
                c10806c.f366272b = bVar.f366269b;
                c10806c.f366274d = bVar.f366270c;
                c10806c.f366275e = "video/avc";
                this.f365999g = new com.otaliastudios.transcoder.strategy.c(c10806c);
            }
            if (this.f366000h == null) {
                this.f366000h = new com.otaliastudios.transcoder.validator.a();
            }
            if (this.f366001i == null) {
                this.f366001i = new com.otaliastudios.transcoder.time.a();
            }
            if (this.f366002j == null) {
                this.f366002j = new y11.c();
            }
            if (this.f366003k == null) {
                this.f366003k = new C49143b();
            }
            i iVar = new i();
            iVar.f365991j = this.f365996d;
            iVar.f365984c = arrayList;
            iVar.f365983b = arrayList2;
            iVar.f365982a = this.f365993a;
            iVar.f365992k = this.f365997e;
            iVar.f365985d = this.f365998f;
            iVar.f365986e = this.f365999g;
            iVar.f365987f = this.f366000h;
            iVar.f365988g = this.f366001i;
            iVar.f365989h = this.f366002j;
            iVar.f365990i = this.f366003k;
            return l.f366222a.submit(new f(iVar));
        }
    }

    public i() {
    }
}
