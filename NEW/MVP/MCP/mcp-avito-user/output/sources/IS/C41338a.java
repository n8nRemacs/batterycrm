package iS;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.darkTheme.c;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.image.state.Scale;
import com.avito.beduin.v2.avito.component.image.state.j;
import com.avito.beduin.v2.avito.component.image.state.o;
import com.avito.beduin.v2.avito.component.image.state.q;
import com.avito.beduin.v2.avito.component.image.state.u;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.theme.r;
import com.facebook.drawee.drawable.s;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LiS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/image/state/b;", "Lcom/avito/android/fresco/SimpleDraweeView;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_image"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C41338a extends AbstractC36333c<com.avito.beduin.v2.avito.component.image.state.b, SimpleDraweeView> {

    /* compiled from: ImageComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LiS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/image/state/b;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_image"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iS.a$a, reason: collision with other inner class name */
    public static final class C11376a extends n<com.avito.beduin.v2.avito.component.image.state.b> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C11376a f398524c = new C11376a();

        public C11376a() {
            super(j.f334423c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new C41338a();
        }
    }

    /* compiled from: ImageComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iS.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f398525a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f334400e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f334401f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.f334402g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.f334403h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Scale.f334404i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f398525a = iArr;
        }
    }

    public C41338a() {
        super(null, 1, null);
    }

    public static Image v(Map map) {
        Uri uri;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            q.b bVar = (q.b) entry.getKey();
            q.c cVar = (q.c) entry.getValue();
            Size size = new Size(bVar.f334442a, bVar.f334443b);
            if (cVar == null || (uri = Uri.parse(cVar.f334444a)) == null) {
                uri = Uri.EMPTY;
            }
            arrayList.add(new Q(size, uri));
        }
        return new Image(P0.p(arrayList));
    }

    public static s.a w(Scale scale) {
        s.c cVar;
        int i12 = scale == null ? -1 : b.f398525a[scale.ordinal()];
        if (i12 == -1 || i12 == 1) {
            cVar = s.c.f340135g;
        } else if (i12 == 2) {
            cVar = s.c.f340133e;
        } else if (i12 == 3) {
            cVar = s.c.f340137i;
        } else if (i12 == 4) {
            cVar = s.c.f340136h;
        } else {
            if (i12 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = s.c.f340129a;
        }
        return (s.a) cVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.image.state.b bVar) {
        Object objW;
        s.c cVarW;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        com.avito.beduin.v2.avito.component.image.state.b bVar2 = bVar;
        D6.G(simpleDraweeView, bVar2.f334412c);
        if (!simpleDraweeView.isAttachedToWindow()) {
            this.f337946f = null;
            this.f337947g = null;
            return;
        }
        simpleDraweeView.setContentDescription(bVar2.f334411b);
        com.avito.beduin.v2.avito.component.image.state.k kVar2 = bVar2.f334410a;
        if (kVar2 instanceof o) {
            simpleDraweeView.getHierarchy().o(null, 5);
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            o oVar = (o) kVar2;
            String str = oVar.f334426a;
            r rVar = oVar.f334428c;
            hierarchy.q(D.c(kVar, str, oVar.f334427b, rVar != null ? Integer.valueOf(s(rVar)) : null), w(kVar2 != null ? ((o) kVar2).getF334434c() : null));
            C35949t5.a(simpleDraweeView).b();
            return;
        }
        if (!(kVar2 instanceof q)) {
            if (kVar2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            C35949t5.a(simpleDraweeView).b();
            return;
        }
        q qVar = (q) kVar2;
        Drawable drawableU = u(qVar.f334435d, kVar);
        if (drawableU != null) {
            GW0.a hierarchy2 = simpleDraweeView.getHierarchy();
            com.avito.beduin.v2.avito.component.image.state.s sVar = qVar.f334435d;
            if (sVar instanceof u) {
                cVarW = w(((u) sVar).f334454d);
            } else {
                if (sVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVarW = s.c.f340135g;
            }
            hierarchy2.o(drawableU, 5);
            hierarchy2.l(5).r((s.a) cVarW);
        } else {
            simpleDraweeView.getHierarchy().o(null, 5);
        }
        com.avito.beduin.v2.avito.component.image.state.s sVar2 = qVar.f334436e;
        Drawable drawableU2 = u(sVar2, kVar);
        if (drawableU2 != null) {
            GW0.a hierarchy3 = simpleDraweeView.getHierarchy();
            if (sVar2 instanceof u) {
                objW = w(((u) sVar2).f334454d);
            } else {
                if (sVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                objW = s.c.f340135g;
            }
            hierarchy3.q(drawableU2, (s.a) objW);
        } else {
            simpleDraweeView.getHierarchy().o(null, 1);
        }
        simpleDraweeView.getHierarchy().n(w(kVar2 != null ? ((q) kVar2).getF334434c() : null));
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169500r = false;
        aVarA.d(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(new UniversalImage(v(qVar.f334432a), v(qVar.f334433b)), c.b(simpleDraweeView.getContext()))));
        aVarA.c();
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new SimpleDraweeView(viewGroup.getContext());
    }

    public final Drawable u(com.avito.beduin.v2.avito.component.image.state.s sVar, com.avito.beduin.v2.theme.k kVar) {
        if (!(sVar instanceof u)) {
            if (sVar == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        u uVar = (u) sVar;
        String str = uVar.f334451a;
        String str2 = uVar.f334452b;
        r rVar = uVar.f334453c;
        return D.c(kVar, str, str2, rVar != null ? Integer.valueOf(s(rVar)) : null);
    }
}
