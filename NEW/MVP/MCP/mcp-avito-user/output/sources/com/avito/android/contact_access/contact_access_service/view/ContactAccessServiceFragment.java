package com.avito.android.contact_access.contact_access_service.view;

import Cd.r;
import Er.AbstractC13522a;
import Er.c;
import Fr.InterfaceC13828a;
import Ju.InterfaceC14249c;
import Y41.p;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.contact_access.contact_access_service.mvi.entity.ContactAccessServiceState;
import com.avito.android.contact_access.contact_access_service.mvi.n;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment;
import com.avito.android.contact_access.di.service.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.LegacyPaymentSessionLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.advert_details.IncompleteRegisterDialog;
import com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import java.util.Collections;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kv.C43501a;
import l90.o;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import z1.AbstractC50339a;

/* compiled from: ContactAccessServiceFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/view/ContactAccessServiceFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactAccessServiceFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f126012n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f126013o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f126014p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.contact_access.contact_access_service.view.f f126015q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f126016r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public k f126017s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f126018t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public n.a f126019u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f126020v0;

    /* compiled from: ContactAccessServiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEr/a;", "it", "Lkotlin/G0;", "invoke", "(LEr/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<AbstractC13522a, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC13522a abstractC13522a) {
            ContactAccessServiceFragment.this.q5().accept(abstractC13522a);
            return G0.f406611a;
        }
    }

    /* compiled from: ContactAccessServiceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$onViewCreated$2$1", f = "ContactAccessServiceFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f126022q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f126023r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ContactAccessServiceFragment f126024s;

        /* compiled from: ContactAccessServiceFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$onViewCreated$2$1$1", f = "ContactAccessServiceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f126025q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ContactAccessServiceFragment f126026r;

            /* compiled from: ContactAccessServiceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$onViewCreated$2$1$1$1", f = "ContactAccessServiceFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$b$a$a, reason: collision with other inner class name */
            public static final class C3737a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f126027q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ContactAccessServiceFragment f126028r;

                /* compiled from: ContactAccessServiceFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3738a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ContactAccessServiceFragment f126029b;

                    public C3738a(ContactAccessServiceFragment contactAccessServiceFragment) {
                        this.f126029b = contactAccessServiceFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Er.c cVar = (Er.c) obj;
                        ContactAccessServiceFragment contactAccessServiceFragment = this.f126029b;
                        if (cVar instanceof c.C0263c) {
                            k kVar = contactAccessServiceFragment.f126017s0;
                            if (kVar != null) {
                                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, kVar.f126052a, com.avito.android.printable_text.b.f(((c.C0263c) cVar).f4358a), null, null, null, null, 0, null, null, false, false, null, null, 4094);
                            }
                        } else if (cVar instanceof c.d) {
                            L5.b(contactAccessServiceFragment.requireActivity(), ((c.d) cVar).f4359a.k0(contactAccessServiceFragment.requireContext()), 0);
                        } else if (L.f(cVar, c.a.f4356a)) {
                            contactAccessServiceFragment.requireActivity().finish();
                        } else if (L.f(cVar, c.b.f4357a)) {
                            Fragment fragmentH = contactAccessServiceFragment.getChildFragmentManager().H("tag_register");
                            if ((fragmentH instanceof IncompleteRegisterDialog ? (IncompleteRegisterDialog) fragmentH : null) == null) {
                                IncompleteRegisterDialog incompleteRegisterDialog = new IncompleteRegisterDialog();
                                incompleteRegisterDialog.f144752f0 = new com.avito.android.contact_access.contact_access_service.view.b(contactAccessServiceFragment);
                                incompleteRegisterDialog.show(contactAccessServiceFragment.getChildFragmentManager(), "tag_register");
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f126029b, ContactAccessServiceFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3737a(ContactAccessServiceFragment contactAccessServiceFragment, Continuation<? super C3737a> continuation) {
                    super(2, continuation);
                    this.f126028r = contactAccessServiceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3737a(this.f126028r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3737a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f126027q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ContactAccessServiceFragment contactAccessServiceFragment = this.f126028r;
                        InterfaceC43160i<Er.c> events = contactAccessServiceFragment.q5().getEvents();
                        C3738a c3738a = new C3738a(contactAccessServiceFragment);
                        this.f126027q = 1;
                        if (events.collect(c3738a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: ContactAccessServiceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$onViewCreated$2$1$1$2", f = "ContactAccessServiceFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$b$a$b, reason: collision with other inner class name */
            public static final class C3739b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f126030q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ContactAccessServiceFragment f126031r;

                /* compiled from: ContactAccessServiceFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment$b$a$b$a, reason: collision with other inner class name */
                public static final class C3740a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ContactAccessServiceFragment f126032b;

                    public C3740a(ContactAccessServiceFragment contactAccessServiceFragment) {
                        this.f126032b = contactAccessServiceFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        ContactAccessServiceState contactAccessServiceState = (ContactAccessServiceState) obj;
                        final k kVar = this.f126032b.f126017s0;
                        if (kVar != null) {
                            boolean z12 = contactAccessServiceState instanceof ContactAccessServiceState.Content;
                            C42670a c42670a = kVar.f126061j;
                            View view = kVar.f126059h;
                            if (z12) {
                                ContactAccessServiceState.Content content = (ContactAccessServiceState.Content) contactAccessServiceState;
                                boolean z13 = content.f125993h;
                                if (z13) {
                                    C42670a.d(c42670a);
                                } else {
                                    c42670a.b();
                                }
                                D6.G(view, !z13);
                                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = kVar.f126062k;
                                collapsingTitleAppBarLayout.setExpanded(true);
                                String str = content.f125987b;
                                collapsingTitleAppBarLayout.setTitle(str);
                                collapsingTitleAppBarLayout.setShortTitle(str);
                                String str2 = content.f125988c;
                                if (str2 != null && str2.length() != 0) {
                                    collapsingTitleAppBarLayout.setSubTitle(str2);
                                }
                                DescriptionListParameterLine.LineType lineType = DescriptionListParameterLine.LineType.f179058c;
                                Object[] objArr = {content.f125990e};
                                Context context = kVar.f126056e;
                                kVar.f126057f.setState(new com.avito.android.lib.design.description_list.parameter_line.a(Collections.singletonList(new com.avito.android.lib.design.description_list.a(content.f125989d, context.getString(R.string.final_price_template, objArr), null, null, null, 28, null)), lineType));
                                w wVar = new w() { // from class: com.avito.android.contact_access.contact_access_service.view.i
                                    @Override // com.avito.android.deep_linking.links.w
                                    public final void i7(DeepLink deepLink) {
                                        ((ContactAccessServiceFragment.a) kVar.f126055d).invoke(new AbstractC13522a.c(deepLink));
                                    }
                                };
                                TextView textView = kVar.f126058g;
                                AttributedText attributedText = content.f125992g;
                                if (attributedText == null) {
                                    D6.w(textView);
                                } else {
                                    attributedText.setOnDeepLinkClickListener(wVar);
                                    CharSequence charSequenceC = kVar.f126054c.c(context, attributedText);
                                    if (charSequenceC == null) {
                                        D6.w(textView);
                                    } else {
                                        D6.H(textView);
                                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                                        textView.setText(charSequenceC);
                                        D6.H(textView);
                                    }
                                }
                            } else if (contactAccessServiceState instanceof ContactAccessServiceState.Error) {
                                D6.w(view);
                                c42670a.c(null, new l(kVar));
                                kVar.f126053b.c(Qc.h.a("ErrorPage", P0.c()));
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3739b(ContactAccessServiceFragment contactAccessServiceFragment, Continuation<? super C3739b> continuation) {
                    super(2, continuation);
                    this.f126031r = contactAccessServiceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3739b(this.f126031r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3739b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f126030q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ContactAccessServiceFragment contactAccessServiceFragment = this.f126031r;
                        n2<ContactAccessServiceState> state = contactAccessServiceFragment.q5().getState();
                        C3740a c3740a = new C3740a(contactAccessServiceFragment);
                        this.f126030q = 1;
                        if (state.collect(c3740a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ContactAccessServiceFragment contactAccessServiceFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f126026r = contactAccessServiceFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f126026r, continuation);
                aVar.f126025q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f126025q;
                ContactAccessServiceFragment contactAccessServiceFragment = this.f126026r;
                C43259k.d(t12, null, null, new C3737a(contactAccessServiceFragment, null), 3);
                C43259k.d(t12, null, null, new C3739b(contactAccessServiceFragment, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22983P interfaceC22983P, ContactAccessServiceFragment contactAccessServiceFragment, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f126023r = interfaceC22983P;
            this.f126024s = contactAccessServiceFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f126023r, this.f126024s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f126022q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC22983P interfaceC22983P = this.f126023r;
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f126024s, null);
                this.f126022q = 1;
                if (C23056p0.b(interfaceC22983P, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ContactAccessServiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof PaymentSessionLink.b.C4013b ? true : interfaceC14249c instanceof LegacyPaymentSessionLink.b.C4003b;
            ContactAccessServiceFragment contactAccessServiceFragment = ContactAccessServiceFragment.this;
            if (z12) {
                contactAccessServiceFragment.requireActivity().setResult(-1);
                contactAccessServiceFragment.requireActivity().finish();
                return;
            }
            if (interfaceC14249c instanceof PaymentSessionLink.b.a) {
                String str = ((PaymentSessionLink.b.a) interfaceC14249c).f133567b;
                if (str != null) {
                    contactAccessServiceFragment.q5().accept(new AbstractC13522a.e(str));
                    return;
                }
                return;
            }
            if (interfaceC14249c instanceof LegacyPaymentSessionLink.b.a) {
                ((LegacyPaymentSessionLink.b.a) interfaceC14249c).getClass();
                return;
            }
            V2.f318762a.e("Unexpected result: " + interfaceC14249c, null);
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f126035m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f126035m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(ContactAccessServiceFragment.this, this.f126035m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ContactAccessServiceFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f126037l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f126037l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f126037l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126038l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f126038l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126039l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126039l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f126039l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ContactAccessServiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/contact_access/contact_access_service/mvi/n;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/contact_access/contact_access_service/mvi/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, n> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final n invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            n.a aVar = ContactAccessServiceFragment.this.f126019u0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public ContactAccessServiceFragment() {
        super(0, 1, null);
        this.f126018t0 = new io.reactivex.rxjava3.disposables.c();
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f126020v0 = new O0(m0.f406844a.b(n.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        String stringExtra;
        super.onActivityResult(i12, i13, intent);
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            if (i13 == -1) {
                q5().accept(AbstractC13522a.d.f4348a);
                return;
            } else {
                requireActivity().finish();
                return;
            }
        }
        if (i13 == -1) {
            ActivityC22955m activityC22955mL1 = l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.setResult(-1);
            }
            requireActivity().finish();
        }
        if (i13 != 0 || intent == null || (stringExtra = intent.getStringExtra("payment_error_result")) == null) {
            return;
        }
        q5().accept(new AbstractC13522a.e(stringExtra));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.contact_access.contact_access_service.view.f fVar = this.f126015q0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e();
        return layoutInflater.inflate(R.layout.contact_access_service, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f126018t0.e();
        super.onDetach();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f126014p0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        com.avito.android.util.text.a aVar = this.f126016r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f126017s0 = new k(viewGroup, interfaceC28373a, aVar, new a());
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner), null, null, new b(viewLifecycleOwner, this, null), 3);
        Fragment fragmentH = getChildFragmentManager().H("tag_register");
        IncompleteRegisterDialog incompleteRegisterDialog = fragmentH instanceof IncompleteRegisterDialog ? (IncompleteRegisterDialog) fragmentH : null;
        if (incompleteRegisterDialog != null) {
            incompleteRegisterDialog.f144752f0 = new com.avito.android.contact_access.contact_access_service.view.b(this);
        }
        com.avito.android.contact_access.contact_access_service.view.f fVar = this.f126015q0;
        (fVar != null ? fVar : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        ContactAccessServiceArguments contactAccessServiceArguments = (ContactAccessServiceArguments) (bundleRequireArguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundleRequireArguments.getParcelable("extra_contact_access_args", ContactAccessServiceArguments.class) : bundleRequireArguments.getParcelable("extra_contact_access_args"));
        if (contactAccessServiceArguments == null) {
            return;
        }
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3744a interfaceC3744aA = com.avito.android.contact_access.di.service.h.a();
        interfaceC3744aA.d((InterfaceC13828a) C29972i.a(C29972i.b(this), InterfaceC13828a.class));
        interfaceC3744aA.e(s.c(this));
        interfaceC3744aA.a(cv.c.b(this));
        interfaceC3744aA.f(contactAccessServiceArguments);
        interfaceC3744aA.c(bundle);
        interfaceC3744aA.b(getResources());
        interfaceC3744aA.build().a(this);
        com.avito.android.contact_access.contact_access_service.view.f fVar = this.f126015q0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f126013o0;
        this.f126018t0.b((aVar != null ? aVar : null).d9().t0(new c()));
    }

    public final n q5() {
        return (n) this.f126020v0.getValue();
    }
}
