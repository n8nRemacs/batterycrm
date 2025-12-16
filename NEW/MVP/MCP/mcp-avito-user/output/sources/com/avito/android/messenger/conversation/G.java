package com.avito.android.messenger.conversation;

import MY.e;
import MY.k;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.Store;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import com.avito.android.webview.l;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1", f = "ChannelFragment.kt", i = {}, l = {845}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class G extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f189062q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189063r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189064s;

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1", f = "ChannelFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f189065q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189066r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ChannelFragment f189067s;

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1$1", f = "ChannelFragment.kt", i = {}, l = {847}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.G$a$a, reason: collision with other inner class name */
        public static final class C5567a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f189068q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189069r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f189070s;

            /* compiled from: ChannelFragment.kt */
            @kotlin.jvm.internal.s0
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMY/g;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LMY/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.conversation.G$a$a$a, reason: collision with other inner class name */
            public static final class C5568a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChannelFragment f189071b;

                public C5568a(ChannelFragment channelFragment) {
                    this.f189071b = channelFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f189071b.f188996l3.accept(((MY.g) obj).f10759g);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5567a(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation continuation) {
                super(2, continuation);
                this.f189069r = nVar;
                this.f189070s = channelFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C5567a(this.f189070s, this.f189069r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C5567a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f189068q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C5568a c5568a = new C5568a(this.f189070s);
                    this.f189068q = 1;
                    if (this.f189069r.le(c5568a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1$2", f = "ChannelFragment.kt", i = {}, l = {852}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f189072q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189073r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f189074s;

            /* compiled from: ChannelFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.G$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C5569a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChannelFragment f189075b;

                public C5569a(ChannelFragment channelFragment) {
                    this.f189075b = channelFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
                    MY.e eVar = (MY.e) obj;
                    ChannelFragment.a aVar = ChannelFragment.f188932o3;
                    ChannelFragment channelFragment = this.f189075b;
                    if (eVar instanceof e.k) {
                        String strK0 = ((e.k) eVar).f10748a.k0(channelFragment.requireContext());
                        Context context = channelFragment.getContext();
                        if (context != null) {
                            L5.b(context, strK0, 0);
                        }
                    } else {
                        if (eVar instanceof e.d) {
                            com.avito.android.connection_quality.connectivity.a aVar2 = channelFragment.f188962V0;
                            if ((aVar2 != null ? aVar2 : null).c()) {
                                Y1 y12 = channelFragment.f188978c3;
                                if (y12 != null) {
                                    MY.m mVar = ((e.d) eVar).f10741a;
                                    y12.F(mVar.f10815b, mVar.f10816c, mVar.f10814a);
                                }
                            } else {
                                Context context2 = channelFragment.getContext();
                                if (context2 != null) {
                                    L5.a(context2, R.string.network_unavailable_message, 0);
                                }
                            }
                        } else if (eVar instanceof e.C0683e) {
                            K2.e(channelFragment);
                            e.C0683e c0683e = (e.C0683e) eVar;
                            MY.i iVar = c0683e.f10742a;
                            boolean zF2 = kotlin.jvm.internal.L.f(iVar.f10761b, iVar.f10762c);
                            String str = c0683e.f10742a.f10760a;
                            if (zF2) {
                                Y1 y13 = channelFragment.f188978c3;
                                if (y13 != null) {
                                    y13.P4(str);
                                }
                            } else {
                                Y1 y14 = channelFragment.f188978c3;
                                if (y14 != null) {
                                    y14.Z(str, false);
                                }
                            }
                        } else if (kotlin.jvm.internal.L.f(eVar, e.l.f10749a)) {
                            InterfaceC35845m2 interfaceC35845m2 = channelFragment.f189011x0;
                            C35966w1.f(channelFragment, (interfaceC35845m2 != null ? interfaceC35845m2 : null).b(Store.f133676d));
                        } else if (eVar instanceof e.c) {
                            String string = channelFragment.getResources().getString(R.string.messenger_shared_location_map_view_title);
                            e.c cVar = (e.c) eVar;
                            double latitude = cVar.f10740a.getLatitude();
                            MessageBody.Location location = cVar.f10740a;
                            GeoMarker[] geoMarkerArr = {new GeoMarker(latitude, location.getLongitude(), null, Collections.singletonList(new AttributedText(location.getTitle(), C42784z0.f406748b, 0, 4, null)))};
                            com.avito.android.messenger.F f12 = channelFragment.f189008u0;
                            if (f12 == null) {
                                f12 = null;
                            }
                            channelFragment.startActivity(f12.g(string, geoMarkerArr, null, true));
                        } else if (eVar instanceof e.f) {
                            MY.n nVar = ((e.f) eVar).f10743a;
                            GeoMarker[] geoMarkerArr2 = nVar.f10818b;
                            com.avito.android.messenger.F f13 = channelFragment.f189008u0;
                            channelFragment.startActivity((f13 != null ? f13 : null).g(nVar.f10817a, geoMarkerArr2, nVar.f10819c, false));
                        } else if (eVar instanceof e.b) {
                            channelFragment.E5(((e.b) eVar).f10739a);
                        } else if (eVar instanceof e.i) {
                            com.avito.android.messenger.conversation.mvi.message_menu.l lVar = channelFragment.f188949O0;
                            com.avito.android.messenger.conversation.mvi.message_menu.l lVar2 = lVar != null ? lVar : null;
                            MY.j jVar = ((e.i) eVar).f10746a;
                            lVar2.Cc(jVar.f10763a, jVar.f10764b, jVar.f10765c);
                        } else if (eVar instanceof e.m) {
                            Uri uri = ((e.m) eVar).f10750a;
                            Context context3 = channelFragment.getContext();
                            if (context3 != null) {
                                com.avito.android.webview.l lVar3 = channelFragment.f189010w0;
                                if (lVar3 == null) {
                                    lVar3 = null;
                                }
                                Intent intentA = l.a.a(lVar3, uri, null, 6);
                                C35974x2.d(intentA);
                                try {
                                    context3.startActivity(intentA);
                                } catch (Exception unused) {
                                    V2.f318762a.j("ChannelFragment", "openWebView() failed to open uri = " + uri, null);
                                }
                            }
                        } else if (eVar instanceof e.a) {
                            kotlin.Q<Uri, String> q12 = ((e.a) eVar).f10738a;
                            Uri uri2 = q12.f406619b;
                            String str2 = q12.f406620c;
                            Context context4 = channelFragment.getContext();
                            if (context4 != null) {
                                InterfaceC35845m2 interfaceC35845m22 = channelFragment.f189011x0;
                                try {
                                    context4.startActivity((interfaceC35845m22 != null ? interfaceC35845m22 : null).m(uri2, str2));
                                } catch (Exception unused2) {
                                    Context context5 = channelFragment.getContext();
                                    if (context5 != null) {
                                        L5.a(context5, R.string.messenger_no_application_can_open_file, 0);
                                    }
                                }
                            }
                        } else if (eVar instanceof e.g) {
                            channelFragment.F5(new D1(channelFragment, ((e.g) eVar).f10744a));
                        } else if (kotlin.jvm.internal.L.f(eVar, e.h.f10745a)) {
                            com.avito.android.messenger.conversation.mvi.send.Q0 q02 = channelFragment.f188942H2;
                            (q02 != null ? q02 : null).f194375h.i0();
                        } else if (eVar instanceof e.j) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = channelFragment.f189012y0;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            b.a.a(aVar3, ((e.j) eVar).f10747a, null, null, 6);
                        }
                    }
                    V2 v22 = V2.f318762a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[" + Thread.currentThread().getName() + ']');
                    sb2.append(" event ");
                    sb2.append(eVar);
                    v22.g("ChannelFragment", sb2.toString());
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f189075b, ChannelFragment.class, "handleChannelEvent", "handleChannelEvent(Lcom/avito/android/messenger/conversation/mvi/channel_feature/entity/ChannelOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation continuation) {
                super(2, continuation);
                this.f189073r = nVar;
                this.f189074s = channelFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f189074s, this.f189073r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f189072q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C5569a c5569a = new C5569a(this.f189074s);
                    this.f189072q = 1;
                    if (this.f189073r.ke(c5569a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1$3", f = "ChannelFragment.kt", i = {}, l = {858}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f189076q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f189077r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189078s;

            /* compiled from: ChannelFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.conversation.G$a$c$a, reason: collision with other inner class name */
            public static final class C5570a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189079b;

                public C5570a(com.avito.android.messenger.conversation.mvi.channel_feature.n nVar) {
                    this.f189079b = nVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f189079b.accept(k.b.d.f10789a);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f189077r = channelFragment;
                this.f189078s = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f189077r, this.f189078s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f189076q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189077r.f189001o1;
                    if (q0Var == null) {
                        q0Var = null;
                    }
                    InterfaceC43160i interfaceC43160iD = com.avito.android.arch.mvi.utils.h.d(kotlinx.coroutines.rx3.y.a(q0Var.f193128z), 500L);
                    C5570a c5570a = new C5570a(this.f189078s);
                    this.f189076q = 1;
                    if (interfaceC43160iD.collect(c5570a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1$4", f = "ChannelFragment.kt", i = {}, l = {866}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f189080q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f189081r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189082s;

            /* compiled from: ChannelFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.conversation.G$a$d$a, reason: collision with other inner class name */
            public static final class C5571a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189083b;

                public C5571a(com.avito.android.messenger.conversation.mvi.channel_feature.n nVar) {
                    this.f189083b = nVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f189083b.accept(k.b.g.f10792a);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f189081r = channelFragment;
                this.f189082s = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f189081r, this.f189082s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f189080q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189081r.f189001o1;
                    if (q0Var == null) {
                        q0Var = null;
                    }
                    InterfaceC43160i interfaceC43160iD = com.avito.android.arch.mvi.utils.h.d(kotlinx.coroutines.rx3.y.a(q0Var.f193095C), 500L);
                    C5571a c5571a = new C5571a(this.f189082s);
                    this.f189080q = 1;
                    if (interfaceC43160iD.collect(c5571a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1$5", f = "ChannelFragment.kt", i = {}, l = {874}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f189084q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f189085r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189086s;

            /* compiled from: ChannelFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.conversation.G$a$e$a, reason: collision with other inner class name */
            public static final class C5572a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189087b;

                public C5572a(com.avito.android.messenger.conversation.mvi.channel_feature.n nVar) {
                    this.f189087b = nVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f189087b.accept(k.b.c.f10788a);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f189085r = channelFragment;
                this.f189086s = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new e(this.f189085r, this.f189086s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((e) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f189084q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189085r.f189001o1;
                    if (q0Var == null) {
                        q0Var = null;
                    }
                    InterfaceC43160i interfaceC43160iD = com.avito.android.arch.mvi.utils.h.d(kotlinx.coroutines.rx3.y.a(q0Var.f193094B), 500L);
                    C5572a c5572a = new C5572a(this.f189086s);
                    this.f189084q = 1;
                    if (interfaceC43160iD.collect(c5572a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindChannelViewModel$1$1$6", f = "ChannelFragment.kt", i = {}, l = {881}, m = "invokeSuspend", n = {}, s = {})
        public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f189088q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f189089r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189090s;

            /* compiled from: ChannelFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.conversation.G$a$f$a, reason: collision with other inner class name */
            public static final class C5573a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.n f189091b;

                public C5573a(com.avito.android.messenger.conversation.mvi.channel_feature.n nVar) {
                    this.f189091b = nVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f189091b.accept(k.b.e.f10790a);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f189089r = channelFragment;
                this.f189090s = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new f(this.f189089r, this.f189090s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f189088q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189089r.f189001o1;
                    if (q0Var == null) {
                        q0Var = null;
                    }
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(q0Var.f193097E);
                    C5573a c5573a = new C5573a(this.f189090s);
                    this.f189088q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c5573a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation continuation) {
            super(2, continuation);
            this.f189066r = nVar;
            this.f189067s = channelFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f189067s, this.f189066r, continuation);
            aVar.f189065q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f189065q;
            com.avito.android.messenger.conversation.mvi.channel_feature.n nVar = this.f189066r;
            ChannelFragment channelFragment = this.f189067s;
            C43259k.d(t12, null, null, new C5567a(channelFragment, nVar, null), 3);
            C43259k.d(t12, null, null, new b(channelFragment, nVar, null), 3);
            C43259k.d(t12, null, null, new c(channelFragment, nVar, null), 3);
            C43259k.d(t12, null, null, new d(channelFragment, nVar, null), 3);
            C43259k.d(t12, null, null, new e(channelFragment, nVar, null), 3);
            C43259k.d(t12, null, null, new f(channelFragment, nVar, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(ChannelFragment channelFragment, com.avito.android.messenger.conversation.mvi.channel_feature.n nVar, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f189063r = channelFragment;
        this.f189064s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new G(this.f189063r, this.f189064s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((G) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f189062q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            com.avito.android.messenger.conversation.mvi.channel_feature.n nVar = this.f189064s;
            ChannelFragment channelFragment = this.f189063r;
            a aVar = new a(channelFragment, nVar, null);
            this.f189062q = 1;
            if (C23056p0.b(channelFragment, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
