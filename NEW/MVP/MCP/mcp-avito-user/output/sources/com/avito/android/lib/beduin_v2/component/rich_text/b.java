package com.avito.android.lib.beduin_v2.component.rich_text;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.avito.component.text.state.TextAlign;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RichTextComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/rich_text/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/a;", "Lcom/avito/android/lib/design/text_view/a;", "a", "_design-modules_beduin-v2_renderer_component_rich-text"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<com.avito.beduin.v2.avito.component.rich_text.state.a, com.avito.android.lib.design.text_view.a> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final d f175874m;

    /* compiled from: RichTextComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/rich_text/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/lib/beduin_v2/component/rich_text/b;", "_design-modules_beduin-v2_renderer_component_rich-text"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<b> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final d f175875c;

        @Inject
        public a(@k d dVar) {
            super(com.avito.beduin.v2.avito.component.rich_text.state.k.f334942c);
            this.f175875c = dVar;
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(this.f175875c);
        }
    }

    /* compiled from: RichTextComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.rich_text.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C5199b {
        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextAlign[] textAlignArr = TextAlign.f335325b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextAlign[] textAlignArr2 = TextAlign.f335325b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextAlign[] textAlignArr3 = TextAlign.f335325b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TextAlign[] textAlignArr4 = TextAlign.f335325b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TextAlign[] textAlignArr5 = TextAlign.f335325b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public b(@k d dVar) {
        super(null, 1, null);
        this.f175874m = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[EDGE_INSN: B:86:0x00ce->B:33:0x00ce BREAK  A[LOOP:0: B:26:0x00b3->B:87:?]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r26, com.avito.beduin.v2.theme.k r27, com.avito.beduin.v2.avito.component.rich_text.state.a r28) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.rich_text.b.l(android.view.View, com.avito.beduin.v2.theme.k, java.lang.Object):void");
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new com.avito.android.lib.design.text_view.a(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
