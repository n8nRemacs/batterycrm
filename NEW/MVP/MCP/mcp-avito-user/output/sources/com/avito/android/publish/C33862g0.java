package com.avito.android.publish;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: PublishAppbarView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/g0;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.g0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33862g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AppBarLayoutWithTextAction f236022a;

    /* compiled from: PublishAppbarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.g0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionMode actionMode = ActionMode.f231832b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActionMode actionMode2 = ActionMode.f231832b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ActionMode actionMode3 = ActionMode.f231832b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ActionMode actionMode4 = ActionMode.f231832b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: PublishAppbarView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/g0$b", "Lru/avito/component/toolbar/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.g0$b */
    public static final class b implements ru.avito.component.toolbar.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f236023b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f236024c;

        public b(Y41.a<kotlin.G0> aVar, Y41.a<kotlin.G0> aVar2) {
            this.f236023b = aVar;
            this.f236024c = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, java.lang.Object] */
        @Override // ru.avito.component.toolbar.a
        public final void R() {
            this.f236024c.invoke();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, java.lang.Object] */
        @Override // ru.avito.component.toolbar.a
        public final void u() {
            this.f236023b.invoke();
        }
    }

    public C33862g0(@Y61.k View view, @Y61.l Boolean bool) {
        ActionMode actionMode;
        View viewFindViewById = view.findViewById(R.id.app_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.AppBarLayoutWithTextAction");
        }
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = (AppBarLayoutWithTextAction) viewFindViewById;
        this.f236022a = appBarLayoutWithTextAction;
        if (bool == null) {
            actionMode = ActionMode.f231836f;
        } else if (bool.equals(Boolean.TRUE)) {
            actionMode = ActionMode.f231832b;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            actionMode = ActionMode.f231833c;
        }
        a(actionMode);
        appBarLayoutWithTextAction.setActionEnabled(true);
        appBarLayoutWithTextAction.setActionTextColor(C35835l0.d(R.attr.gray54, view.getContext()));
        RelativeLayout relativeLayout = appBarLayoutWithTextAction.f430579F;
        int paddingLeft = (relativeLayout == null ? null : relativeLayout).getPaddingLeft();
        RelativeLayout relativeLayout2 = appBarLayoutWithTextAction.f430579F;
        int paddingRight = (relativeLayout2 == null ? null : relativeLayout2).getPaddingRight();
        RelativeLayout relativeLayout3 = appBarLayoutWithTextAction.f430579F;
        (relativeLayout3 != null ? relativeLayout3 : null).setPadding(paddingLeft, 0, paddingRight, 0);
    }

    public final void a(@Y61.k ActionMode actionMode) {
        String string;
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = this.f236022a;
        Context context = appBarLayoutWithTextAction.getContext();
        int iOrdinal = actionMode.ordinal();
        if (iOrdinal == 0) {
            string = context.getString(R.string.save_and_close);
        } else if (iOrdinal == 1) {
            string = context.getString(R.string.close);
        } else if (iOrdinal == 2) {
            string = context.getString(R.string.clear_list);
        } else if (iOrdinal == 3) {
            string = context.getString(R.string.publish_appbar_action_remove);
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = null;
        }
        appBarLayoutWithTextAction.setAction(string);
    }

    public final void b(@Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2) {
        this.f236022a.setClickListener(new b(aVar, aVar2));
    }

    public final void c(int i12) {
        CollapsingTitleAppBarLayout.m(this.f236022a, i12);
    }

    public final void d(@Y61.k ru.avito.component.toolbar.d dVar) {
        this.f236022a.o(dVar);
    }

    public /* synthetic */ C33862g0(View view, Boolean bool, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : bool);
    }
}
