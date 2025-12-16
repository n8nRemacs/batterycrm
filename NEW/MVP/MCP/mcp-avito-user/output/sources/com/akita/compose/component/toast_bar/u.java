package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.I;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: ToastBarHostState.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/akita/compose/component/toast_bar/u;", "", "<init>", "()V", "a", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f63284a = new kotlinx.coroutines.sync.d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f63285b = C22126m3.g(null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.akita.compose.component.toast_bar.J r17, @Y61.k java.lang.String r18, @Y61.k java.lang.Object r19, @Y61.l java.lang.String r20, @Y61.k com.akita.compose.component.toast_bar.ToastBarDuration r21, @Y61.k com.akita.compose.component.toast_bar.ToastBarPosition r22, boolean r23, @Y61.k kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.toast_bar.u.a(com.akita.compose.component.toast_bar.J, java.lang.String, java.lang.Object, java.lang.String, com.akita.compose.component.toast_bar.ToastBarDuration, com.akita.compose.component.toast_bar.ToastBarPosition, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ToastBarHostState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/toast_bar/u$a;", "Lcom/akita/compose/component/toast_bar/f;", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC27357f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f63286a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f63287b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J f63288c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f63289d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ToastBarDuration f63290e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ToastBarPosition f63291f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final InterfaceC43271q<I> f63292g;

        public a(@Y61.k String str, @Y61.k Object obj, @Y61.k J j12, @Y61.l String str2, @Y61.k ToastBarDuration toastBarDuration, @Y61.k ToastBarPosition toastBarPosition, @Y61.k InterfaceC43271q interfaceC43271q) {
            this.f63286a = str;
            this.f63287b = obj;
            this.f63288c = j12;
            this.f63289d = str2;
            this.f63290e = toastBarDuration;
            this.f63291f = toastBarPosition;
            this.f63292g = interfaceC43271q;
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        public final void a(@Y61.k I i12) {
            InterfaceC43271q<I> interfaceC43271q = this.f63292g;
            if (interfaceC43271q.isActive()) {
                int i13 = Z.f406624c;
                interfaceC43271q.resumeWith(i12);
            }
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF63289d() {
            return this.f63289d;
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        public final void c() {
            a(I.d.f63214a);
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        public final void dismiss() {
            InterfaceC43271q<I> interfaceC43271q = this.f63292g;
            if (interfaceC43271q.isActive()) {
                int i12 = Z.f406624c;
                interfaceC43271q.resumeWith(I.a.f63212a);
            }
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        @Y61.k
        /* renamed from: getDuration, reason: from getter */
        public final ToastBarDuration getF167348c() {
            return this.f63290e;
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        @Y61.k
        /* renamed from: getMessage, reason: from getter */
        public final String getF167346a() {
            return this.f63286a;
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        @Y61.k
        /* renamed from: getPosition, reason: from getter */
        public final ToastBarPosition getF167349d() {
            return this.f63291f;
        }

        @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
        @Y61.k
        /* renamed from: getStyle, reason: from getter */
        public final J getF167347b() {
            return this.f63288c;
        }

        public /* synthetic */ a(String str, Object obj, J j12, String str2, String str3, ToastBarDuration toastBarDuration, ToastBarPosition toastBarPosition, InterfaceC43271q interfaceC43271q, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, obj, j12, str2, toastBarDuration, toastBarPosition, interfaceC43271q);
        }
    }
}
