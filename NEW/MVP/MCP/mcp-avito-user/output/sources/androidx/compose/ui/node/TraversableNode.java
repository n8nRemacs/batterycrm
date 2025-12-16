package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: TraversableNode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/k;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TraversableNode extends InterfaceC22419k {

    /* compiled from: TraversableNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion;", "", "()V", "TraverseDescendantsAction", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TraversableNode.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TraverseDescendantsAction {

            /* renamed from: b, reason: collision with root package name */
            public static final TraverseDescendantsAction f40695b;

            /* renamed from: c, reason: collision with root package name */
            public static final TraverseDescendantsAction f40696c;

            /* renamed from: d, reason: collision with root package name */
            public static final TraverseDescendantsAction f40697d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ TraverseDescendantsAction[] f40698e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f40699f;

            static {
                TraverseDescendantsAction traverseDescendantsAction = new TraverseDescendantsAction("ContinueTraversal", 0);
                f40695b = traverseDescendantsAction;
                TraverseDescendantsAction traverseDescendantsAction2 = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
                f40696c = traverseDescendantsAction2;
                TraverseDescendantsAction traverseDescendantsAction3 = new TraverseDescendantsAction("CancelTraversal", 2);
                f40697d = traverseDescendantsAction3;
                TraverseDescendantsAction[] traverseDescendantsActionArr = {traverseDescendantsAction, traverseDescendantsAction2, traverseDescendantsAction3};
                f40698e = traverseDescendantsActionArr;
                f40699f = kotlin.enums.c.a(traverseDescendantsActionArr);
            }

            public TraverseDescendantsAction() {
                throw null;
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) f40698e.clone();
            }
        }

        static {
            new Companion();
        }
    }

    @Y61.k
    Object o0();
}
