package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: FunctionDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42878w extends AbstractC42871o implements InterfaceC42905x {

    /* renamed from: A, reason: collision with root package name */
    public volatile Y41.a<Collection<InterfaceC42905x>> f407702A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC42905x f407703B;

    /* renamed from: C, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f407704C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public InterfaceC42905x f407705D;

    /* renamed from: E, reason: collision with root package name */
    public Map<InterfaceC42848a.InterfaceC11651a<?>, Object> f407706E;

    /* renamed from: f, reason: collision with root package name */
    public List<g0> f407707f;

    /* renamed from: g, reason: collision with root package name */
    public List<k0> f407708g;

    /* renamed from: h, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.types.O f407709h;

    /* renamed from: i, reason: collision with root package name */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.X> f407710i;

    /* renamed from: j, reason: collision with root package name */
    public O f407711j;

    /* renamed from: k, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.X f407712k;

    /* renamed from: l, reason: collision with root package name */
    public Modality f407713l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC42900s f407714m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f407715n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f407716o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f407717p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f407718q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f407719r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f407720s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f407721t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f407722u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f407723v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f407724w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f407725x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f407726y;

    /* renamed from: z, reason: collision with root package name */
    public Collection<? extends InterfaceC42905x> f407727z;

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.w$a */
    public class a implements InterfaceC42905x.a<InterfaceC42905x> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public A0 f407728a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public InterfaceC42882k f407729b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public Modality f407730c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public AbstractC42900s f407731d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public InterfaceC42905x f407732e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public CallableMemberDescriptor.Kind f407733f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public List<k0> f407734g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.X> f407735h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public O f407736i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public kotlin.reflect.jvm.internal.impl.descriptors.X f407737j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public kotlin.reflect.jvm.internal.impl.types.O f407738k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public kotlin.reflect.jvm.internal.impl.name.f f407739l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f407740m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f407741n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f407742o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f407743p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f407744q;

        /* renamed from: r, reason: collision with root package name */
        public C42784z0 f407745r;

        /* renamed from: s, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f407746s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f407747t;

        /* renamed from: u, reason: collision with root package name */
        public final LinkedHashMap f407748u;

        /* renamed from: v, reason: collision with root package name */
        public Boolean f407749v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f407750w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ AbstractC42878w f407751x;

        public a(@Y61.k AbstractC42878w abstractC42878w, @Y61.k A0 a02, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k List list, @Y61.l List list2, @Y61.k O o12, kotlin.reflect.jvm.internal.impl.types.O o13) {
            if (a02 == null) {
                s(0);
                throw null;
            }
            if (interfaceC42882k == null) {
                s(1);
                throw null;
            }
            if (modality == null) {
                s(2);
                throw null;
            }
            if (abstractC42900s == null) {
                s(3);
                throw null;
            }
            if (kind == null) {
                s(4);
                throw null;
            }
            if (list == null) {
                s(5);
                throw null;
            }
            if (list2 == null) {
                s(6);
                throw null;
            }
            if (o13 == null) {
                s(7);
                throw null;
            }
            this.f407751x = abstractC42878w;
            this.f407732e = null;
            this.f407737j = abstractC42878w.f407712k;
            this.f407740m = true;
            this.f407741n = false;
            this.f407742o = false;
            this.f407743p = false;
            this.f407744q = abstractC42878w.f407722u;
            this.f407745r = null;
            this.f407746s = null;
            this.f407747t = abstractC42878w.f407723v;
            this.f407748u = new LinkedHashMap();
            this.f407749v = null;
            this.f407750w = false;
            this.f407728a = a02;
            this.f407729b = interfaceC42882k;
            this.f407730c = modality;
            this.f407731d = abstractC42900s;
            this.f407733f = kind;
            this.f407734g = list;
            this.f407735h = list2;
            this.f407736i = o12;
            this.f407738k = o13;
            this.f407739l = null;
        }

        public static /* synthetic */ void s(int i12) {
            String str;
            int i13;
            switch (i12) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i12) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i13 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    i13 = 3;
                    break;
            }
            Object[] objArr = new Object[i13];
            switch (i12) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = MessageBody.Location.KIND;
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = SearchParamsConverterKt.OWNER;
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS;
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i12) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    objArr[1] = "setReturnType";
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i12) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i12) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a a(@Y61.k C42784z0 c42784z0) {
            if (c42784z0 != null) {
                this.f407745r = c42784z0;
                return this;
            }
            s(21);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a b(@Y61.l kotlin.reflect.jvm.internal.impl.descriptors.X x12) {
            this.f407737j = x12;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.l
        public final InterfaceC42905x build() {
            return this.f407751x.G0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a c(@Y61.k A0 a02) {
            if (a02 != null) {
                this.f407728a = a02;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a d() {
            this.f407744q = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a e(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar != null) {
                this.f407739l = fVar;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a f(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12) {
            if (o12 != null) {
                this.f407738k = o12;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a g(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            if (gVar != null) {
                this.f407746s = gVar;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a h(@Y61.k InterfaceC42848a.InterfaceC11651a interfaceC11651a) {
            Boolean bool = Boolean.TRUE;
            if (interfaceC11651a != null) {
                this.f407748u.put(interfaceC11651a, bool);
                return this;
            }
            s(39);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a i() {
            this.f407740m = false;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a j(@Y61.k AbstractC42900s abstractC42900s) {
            if (abstractC42900s != null) {
                this.f407731d = abstractC42900s;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a k(@Y61.k InterfaceC42851d interfaceC42851d) {
            if (interfaceC42851d != null) {
                this.f407729b = interfaceC42851d;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a l(@Y61.l InterfaceC42850c interfaceC42850c) {
            this.f407732e = interfaceC42850c;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a m() {
            this.f407742o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a n(@Y61.k List list) {
            if (list != null) {
                this.f407734g = list;
                return this;
            }
            s(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a o() {
            this.f407747t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a p(@Y61.k Modality modality) {
            if (modality != null) {
                this.f407730c = modality;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a q(@Y61.k CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f407733f = kind;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @Y61.k
        public final InterfaceC42905x.a r() {
            this.f407741n = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42878w(@Y61.k CallableMemberDescriptor.Kind kind, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.l InterfaceC42905x interfaceC42905x, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(interfaceC42882k, gVar, fVar, b0Var);
        if (interfaceC42882k == null) {
            L(0);
            throw null;
        }
        if (gVar == null) {
            L(1);
            throw null;
        }
        if (fVar == null) {
            L(2);
            throw null;
        }
        if (kind == null) {
            L(3);
            throw null;
        }
        if (b0Var == null) {
            L(4);
            throw null;
        }
        this.f407714m = kotlin.reflect.jvm.internal.impl.descriptors.r.f407793i;
        this.f407715n = false;
        this.f407716o = false;
        this.f407717p = false;
        this.f407718q = false;
        this.f407719r = false;
        this.f407720s = false;
        this.f407721t = false;
        this.f407722u = false;
        this.f407723v = false;
        this.f407724w = false;
        this.f407725x = true;
        this.f407726y = false;
        this.f407727z = null;
        this.f407702A = null;
        this.f407705D = null;
        this.f407706E = null;
        this.f407703B = interfaceC42905x == null ? this : interfaceC42905x;
        this.f407704C = kind;
    }

    @Y61.l
    public static ArrayList H0(InterfaceC42905x interfaceC42905x, @Y61.k List list, @Y61.k E0 e02, boolean z12, boolean z13, @Y61.l boolean[] zArr) {
        if (list == null) {
            L(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            kotlin.reflect.jvm.internal.impl.types.O type = k0Var.getType();
            Variance variance = Variance.f410070e;
            kotlin.reflect.jvm.internal.impl.types.O oJ2 = e02.j(type, variance);
            kotlin.reflect.jvm.internal.impl.types.O oS2 = k0Var.S();
            kotlin.reflect.jvm.internal.impl.types.O oJ3 = oS2 == null ? null : e02.j(oS2, variance);
            if (oJ2 == null) {
                return null;
            }
            if ((oJ2 != k0Var.getType() || oS2 != oJ3) && zArr != null) {
                zArr[0] = true;
            }
            C42877v c42877v = k0Var instanceof V.b ? new C42877v((List) ((V.b) k0Var).f407636n.getValue()) : null;
            k0 k0Var2 = z12 ? null : k0Var;
            int index = k0Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = k0Var.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.f name = k0Var.getName();
            boolean zK02 = k0Var.k0();
            boolean zZ02 = k0Var.z0();
            boolean zY02 = k0Var.y0();
            b0 b0VarE = z13 ? k0Var.e() : b0.f407539a;
            V.f407629m.getClass();
            arrayList.add(c42877v == null ? new V(interfaceC42905x, k0Var2, index, annotations, name, oJ2, zK02, zZ02, zY02, oJ3, b0VarE) : new V.b(interfaceC42905x, k0Var2, index, annotations, name, oJ2, zK02, zZ02, zY02, oJ3, b0VarE, c42877v));
        }
        return arrayList;
    }

    public static /* synthetic */ void L(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i13 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 4:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 31:
                objArr[0] = "substitutor";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i12) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[1] = "copy";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i12) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return interfaceC42884m.h(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    @Y61.l
    public final InterfaceC42905x A0() {
        return this.f407705D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean E0() {
        return this.f407722u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.X F() {
        return this.f407712k;
    }

    @Y61.k
    public abstract AbstractC42878w F0(@Y61.k CallableMemberDescriptor.Kind kind, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.l InterfaceC42905x interfaceC42905x, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar);

    @Y61.l
    public AbstractC42878w G0(@Y61.k a aVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        O o12;
        AbstractC42860d abstractC42860d;
        kotlin.reflect.jvm.internal.impl.types.O oJ2;
        if (aVar == null) {
            L(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        if (aVar.f407746s != null) {
            annotations = getAnnotations();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = aVar.f407746s;
            if (annotations.isEmpty()) {
                annotations = gVar;
            } else if (!gVar.isEmpty()) {
                annotations = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(annotations, gVar);
            }
        } else {
            annotations = getAnnotations();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2 = annotations;
        InterfaceC42882k interfaceC42882k = aVar.f407729b;
        InterfaceC42905x interfaceC42905x = aVar.f407732e;
        CallableMemberDescriptor.Kind kind = aVar.f407733f;
        kotlin.reflect.jvm.internal.impl.name.f fVar = aVar.f407739l;
        b0 b0VarE = aVar.f407742o ? (interfaceC42905x != null ? interfaceC42905x : n0()).e() : b0.f407539a;
        if (b0VarE == null) {
            L(27);
            throw null;
        }
        AbstractC42878w abstractC42878wF0 = F0(kind, interfaceC42882k, interfaceC42905x, b0VarE, gVar2, fVar);
        List<g0> typeParameters = aVar.f407745r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        E0 e0C = kotlin.reflect.jvm.internal.impl.types.A.c(typeParameters, aVar.f407728a, abstractC42878wF0, arrayList, zArr);
        if (e0C == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!aVar.f407735h.isEmpty()) {
            int i12 = 0;
            for (kotlin.reflect.jvm.internal.impl.descriptors.X x12 : aVar.f407735h) {
                kotlin.reflect.jvm.internal.impl.types.O oJ3 = e0C.j(x12.getType(), Variance.f410070e);
                if (oJ3 == null) {
                    return null;
                }
                int i13 = i12 + 1;
                arrayList2.add(kotlin.reflect.jvm.internal.impl.resolve.i.b(abstractC42878wF0, oJ3, ((r51.f) x12.getValue()).a(), x12.getAnnotations(), i12));
                zArr[0] = zArr[0] | (oJ3 != x12.getType());
                i12 = i13;
            }
        }
        O o13 = aVar.f407736i;
        if (o13 != null) {
            kotlin.reflect.jvm.internal.impl.types.O oJ4 = e0C.j(o13.getType(), Variance.f410070e);
            if (oJ4 == null) {
                return null;
            }
            O o14 = new O(abstractC42878wF0, new r51.d(abstractC42878wF0, oJ4, aVar.f407736i.getValue()), aVar.f407736i.getAnnotations());
            zArr[0] = (oJ4 != aVar.f407736i.getType()) | zArr[0];
            o12 = o14;
        } else {
            o12 = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.X x13 = aVar.f407737j;
        if (x13 != null) {
            AbstractC42860d abstractC42860dB = x13.b(e0C);
            if (abstractC42860dB == null) {
                return null;
            }
            zArr[0] = zArr[0] | (abstractC42860dB != aVar.f407737j);
            abstractC42860d = abstractC42860dB;
        } else {
            abstractC42860d = null;
        }
        ArrayList arrayListH0 = H0(abstractC42878wF0, aVar.f407734g, e0C, aVar.f407743p, aVar.f407742o, zArr);
        if (arrayListH0 == null || (oJ2 = e0C.j(aVar.f407738k, Variance.f410071f)) == null) {
            return null;
        }
        boolean z12 = zArr[0] | (oJ2 != aVar.f407738k);
        zArr[0] = z12;
        if (!z12 && aVar.f407750w) {
            return this;
        }
        abstractC42878wF0.I0(o12, abstractC42860d, arrayList2, arrayList, arrayListH0, oJ2, aVar.f407730c, aVar.f407731d);
        abstractC42878wF0.f407715n = this.f407715n;
        abstractC42878wF0.f407716o = this.f407716o;
        abstractC42878wF0.f407717p = this.f407717p;
        abstractC42878wF0.f407718q = this.f407718q;
        abstractC42878wF0.f407719r = this.f407719r;
        abstractC42878wF0.f407724w = this.f407724w;
        abstractC42878wF0.f407720s = this.f407720s;
        abstractC42878wF0.f407721t = this.f407721t;
        abstractC42878wF0.L0(this.f407725x);
        abstractC42878wF0.f407722u = aVar.f407744q;
        abstractC42878wF0.f407723v = aVar.f407747t;
        Boolean bool = aVar.f407749v;
        abstractC42878wF0.M0(bool != null ? bool.booleanValue() : this.f407726y);
        if (!aVar.f407748u.isEmpty() || this.f407706E != null) {
            LinkedHashMap linkedHashMap = aVar.f407748u;
            Map<InterfaceC42848a.InterfaceC11651a<?>, Object> map = this.f407706E;
            if (map != null) {
                for (Map.Entry<InterfaceC42848a.InterfaceC11651a<?>, Object> entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                abstractC42878wF0.f407706E = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                abstractC42878wF0.f407706E = linkedHashMap;
            }
        }
        if (aVar.f407741n || this.f407705D != null) {
            InterfaceC42905x interfaceC42905x2 = this.f407705D;
            if (interfaceC42905x2 == null) {
                interfaceC42905x2 = this;
            }
            abstractC42878wF0.f407705D = interfaceC42905x2.b(e0C);
        }
        if (aVar.f407740m && !n0().p().isEmpty()) {
            if (aVar.f407728a.e()) {
                Y41.a<Collection<InterfaceC42905x>> aVar2 = this.f407702A;
                if (aVar2 != null) {
                    abstractC42878wF0.f407702A = aVar2;
                } else {
                    abstractC42878wF0.l0(p());
                }
            } else {
                abstractC42878wF0.f407702A = new C42876u(this, e0C);
            }
        }
        return abstractC42878wF0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.X H() {
        return this.f407711j;
    }

    @Y61.k
    public void I0(@Y61.l O o12, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.X x12, @Y61.k List list, @Y61.k List list2, @Y61.k List list3, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o13, @Y61.l Modality modality, @Y61.k AbstractC42900s abstractC42900s) {
        if (list == null) {
            L(5);
            throw null;
        }
        if (list2 == null) {
            L(6);
            throw null;
        }
        if (list3 == null) {
            L(7);
            throw null;
        }
        if (abstractC42900s == null) {
            L(8);
            throw null;
        }
        this.f407707f = C42745f0.M0(list2);
        this.f407708g = C42745f0.M0(list3);
        this.f407709h = o13;
        this.f407713l = modality;
        this.f407714m = abstractC42900s;
        this.f407711j = o12;
        this.f407712k = x12;
        this.f407710i = list;
        for (int i12 = 0; i12 < list2.size(); i12++) {
            g0 g0Var = (g0) list2.get(i12);
            if (g0Var.getIndex() != i12) {
                throw new IllegalStateException(g0Var + " index is " + g0Var.getIndex() + " but position is " + i12);
            }
        }
        for (int i13 = 0; i13 < list3.size(); i13++) {
            k0 k0Var = (k0) list3.get(i13);
            if (k0Var.getIndex() != i13) {
                throw new IllegalStateException(k0Var + "index is " + k0Var.getIndex() + " but position is " + i13);
            }
        }
    }

    @Y61.k
    public final a J0(@Y61.k E0 e02) {
        if (e02 != null) {
            return new a(this, e02.g(), f(), i(), getVisibility(), getKind(), g(), T(), this.f407711j, getReturnType());
        }
        L(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public boolean K() {
        return this.f407726y;
    }

    public final <V> void K0(InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a, Object obj) {
        if (this.f407706E == null) {
            this.f407706E = new LinkedHashMap();
        }
        this.f407706E.put(interfaceC11651a, obj);
    }

    public void L0(boolean z12) {
        this.f407725x = z12;
    }

    public void M0(boolean z12) {
        this.f407726y = z12;
    }

    public final void N0(@Y61.k kotlin.reflect.jvm.internal.impl.types.Y y12) {
        if (y12 != null) {
            this.f407709h = y12;
        } else {
            L(11);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return this.f407720s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.X> T() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.X> list = this.f407710i;
        if (list != null) {
            return list;
        }
        L(13);
        throw null;
    }

    public boolean Z() {
        return this.f407719r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<k0> g() {
        List<k0> list = this.f407708g;
        if (list != null) {
            return list;
        }
        L(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    public final CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f407704C;
        if (kind != null) {
            return kind;
        }
        L(21);
        throw null;
    }

    public kotlin.reflect.jvm.internal.impl.types.O getReturnType() {
        return this.f407709h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<g0> getTypeParameters() {
        List<g0> list = this.f407707f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s abstractC42900s = this.f407714m;
        if (abstractC42900s != null) {
            return abstractC42900s;
        }
        L(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        Modality modality = this.f407713l;
        if (modality != null) {
            return modality;
        }
        L(15);
        throw null;
    }

    public boolean isExternal() {
        return this.f407717p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isInfix() {
        if (this.f407716o) {
            return true;
        }
        Iterator<? extends CallableMemberDescriptor> it = n0().p().iterator();
        while (it.hasNext()) {
            if (((InterfaceC42905x) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f407718q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isOperator() {
        if (this.f407715n) {
            return true;
        }
        Iterator<? extends CallableMemberDescriptor> it = n0().p().iterator();
        while (it.hasNext()) {
            if (((InterfaceC42905x) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public boolean isSuspend() {
        return this.f407724w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l0(@Y61.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            L(17);
            throw null;
        }
        this.f407727z = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC42905x) it.next()).z()) {
                this.f407723v = true;
                return;
            }
        }
    }

    @Y61.k
    public InterfaceC42905x.a<? extends InterfaceC42905x> m0() {
        return J0(E0.f410009b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    public InterfaceC42905x n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        InterfaceC42905x interfaceC42905xBuild = m0().k(interfaceC42851d).p(modality).j(abstractC42887p).q(CallableMemberDescriptor.Kind.f407409c).i().build();
        if (interfaceC42905xBuild != null) {
            return interfaceC42905xBuild;
        }
        L(26);
        throw null;
    }

    @Y61.k
    public Collection<? extends InterfaceC42905x> p() {
        Y41.a<Collection<InterfaceC42905x>> aVar = this.f407702A;
        if (aVar != null) {
            this.f407727z = aVar.invoke();
            this.f407702A = null;
        }
        Collection<? extends InterfaceC42905x> collectionEmptyList = this.f407727z;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        L(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return this.f407721t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public <V> V x(InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a) {
        Map<InterfaceC42848a.InterfaceC11651a<?>, Object> map = this.f407706E;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC11651a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean z() {
        return this.f407723v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public InterfaceC42905x b(@Y61.k E0 e02) {
        if (e02 == null) {
            L(22);
            throw null;
        }
        if (e02.f410010a.e()) {
            return this;
        }
        a aVarJ0 = J0(e02);
        aVarJ0.f407732e = n0();
        aVarJ0.f407742o = true;
        aVarJ0.f407750w = true;
        return aVarJ0.f407751x.G0(aVarJ0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public InterfaceC42905x n0() {
        InterfaceC42905x interfaceC42905x = this.f407703B;
        InterfaceC42905x interfaceC42905xN0 = interfaceC42905x == this ? this : interfaceC42905x.n0();
        if (interfaceC42905xN0 != null) {
            return interfaceC42905xN0;
        }
        L(20);
        throw null;
    }
}
