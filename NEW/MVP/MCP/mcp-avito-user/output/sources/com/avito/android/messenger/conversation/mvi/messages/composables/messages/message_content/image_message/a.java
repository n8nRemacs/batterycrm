package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message;

import Y41.p;
import Y41.q;
import Y61.k;
import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: ImageMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f192487a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f192488b = new C22096n(541836275, C5685a.f192492l, false);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C22096n f192489c = new C22096n(2034456350, b.f192493l, false);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C22096n f192490d = new C22096n(-987861333, c.f192494l, false);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C22096n f192491e = new C22096n(1923165838, d.f192495l, false);

    /* compiled from: ImageMessageContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.a$a, reason: collision with other inner class name */
    public static final class C5685a extends N implements q<InterfaceC20793y, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5685a f192492l = new C5685a();

        public C5685a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                f.c(a13, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImageMessageContent.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f192493l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                List listD = C43033p.D(new com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages.f(null, 1, null).a());
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                C20650b.a(vVarB, null, R1.a(4), false, null, null, null, false, null, new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.c(listD), a13, 384, 506);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImageMessageContent.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f192494l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                f.a(Uri.parse("invalid image uri"), Uri.parse("invalid image uri"), false, C20588k2.d(v.f42878y1, 1.0f), true, a13, 28104, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImageMessageContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f192495l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a.f192487a.getClass();
                com.avito.android.messenger.conversation.mvi.messages.preview.preview_wrappers.d.a(null, false, false, a.f192490d, a13, 24576, 15);
            }
            return G0.f406611a;
        }
    }
}
