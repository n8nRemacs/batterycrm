package com.avito.android.iac_dialer.impl_module.audio.dtmf;

import Y61.k;
import android.media.ToneGenerator;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: IacDtmfTonePlayer.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/dtmf/b;", "Lcom/avito/android/iac_dialer/impl_module/audio/dtmf/a;", "<init>", "()V", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.audio.dtmf.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165845a = C42727D.c(C4915b.f165846l);

    /* compiled from: IacDtmfTonePlayer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/dtmf/b$a;", "", "<init>", "()V", "", "TONE_DURATION", "I", "TONE_VOLUME", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacDtmfTonePlayer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/ToneGenerator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.audio.dtmf.b$b, reason: collision with other inner class name */
    public static final class C4915b extends N implements Y41.a<ToneGenerator> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4915b f165846l = new C4915b();

        public C4915b() {
            super(0);
        }

        @Override // Y41.a
        public final ToneGenerator invoke() {
            return new ToneGenerator(0, 100);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    @Override // com.avito.android.iac_dialer.impl_module.audio.dtmf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.audio.dtmf.b.a(java.lang.String):void");
    }
}
