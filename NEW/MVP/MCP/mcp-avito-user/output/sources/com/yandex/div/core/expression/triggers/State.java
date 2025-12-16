package com.yandex.div.core.expression.triggers;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConditionPart.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State;", "", "a", "b", "c", "d", "Input", "e", "f", "g", "h", "i", "Lcom/yandex/div/core/expression/triggers/State$h;", "Lcom/yandex/div/core/expression/triggers/State$g;", "Lcom/yandex/div/core/expression/triggers/State$i;", "Lcom/yandex/div/core/expression/triggers/State$d;", "Lcom/yandex/div/core/expression/triggers/State$e;", "Lcom/yandex/div/core/expression/triggers/State$f;", "Lcom/yandex/div/core/expression/triggers/State$c;", "Lcom/yandex/div/core/expression/triggers/State$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
interface State {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$Input;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Input {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Input[] f367474b = {new Input("Letter", 0), new Input("VarSpecial", 1), new Input("OpeningBracket", 2), new Input("Other", 3), new Input("SingleQuote", 4), new Input("EscapeCharacter", 5), new Input("EndOfLine", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        Input EF5;

        /* compiled from: ConditionPart.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$Input$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public Input() {
            throw null;
        }

        public static Input valueOf(String str) {
            return (Input) Enum.valueOf(Input.class, str);
        }

        public static Input[] values() {
            return (Input[]) f367474b.clone();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* compiled from: ConditionPart.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.expression.triggers.State$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10855a {
            static {
                int[] iArr = new int[Input.values().length];
                Input[] inputArr = Input.f367474b;
                iArr[0] = 1;
                Input[] inputArr2 = Input.f367474b;
                iArr[1] = 2;
                Input[] inputArr3 = Input.f367474b;
                iArr[2] = 3;
                Input[] inputArr4 = Input.f367474b;
                iArr[3] = 4;
                Input[] inputArr5 = Input.f367474b;
                iArr[5] = 5;
                Input[] inputArr6 = Input.f367474b;
                iArr[4] = 6;
                Input[] inputArr7 = Input.f367474b;
                iArr[6] = 7;
            }
        }

        static {
            new a();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$b;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements State {
        static {
            new b();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$c;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements State {
        static {
            new c();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$d;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d implements State {
        static {
            new d();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$e;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Input.values().length];
                Input[] inputArr = Input.f367474b;
                iArr[0] = 1;
                Input[] inputArr2 = Input.f367474b;
                iArr[1] = 2;
                Input[] inputArr3 = Input.f367474b;
                iArr[2] = 3;
                Input[] inputArr4 = Input.f367474b;
                iArr[3] = 4;
                Input[] inputArr5 = Input.f367474b;
                iArr[4] = 5;
                Input[] inputArr6 = Input.f367474b;
                iArr[5] = 6;
                Input[] inputArr7 = Input.f367474b;
                iArr[6] = 7;
            }
        }

        static {
            new e();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$f;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Input.values().length];
                Input[] inputArr = Input.f367474b;
                iArr[0] = 1;
                Input[] inputArr2 = Input.f367474b;
                iArr[1] = 2;
                Input[] inputArr3 = Input.f367474b;
                iArr[2] = 3;
                Input[] inputArr4 = Input.f367474b;
                iArr[3] = 4;
                Input[] inputArr5 = Input.f367474b;
                iArr[5] = 5;
                Input[] inputArr6 = Input.f367474b;
                iArr[4] = 6;
                Input[] inputArr7 = Input.f367474b;
                iArr[6] = 7;
            }
        }

        static {
            new f();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$g;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Input.values().length];
                Input[] inputArr = Input.f367474b;
                iArr[3] = 1;
                Input[] inputArr2 = Input.f367474b;
                iArr[1] = 2;
                Input[] inputArr3 = Input.f367474b;
                iArr[2] = 3;
                Input[] inputArr4 = Input.f367474b;
                iArr[5] = 4;
                Input[] inputArr5 = Input.f367474b;
                iArr[0] = 5;
                Input[] inputArr6 = Input.f367474b;
                iArr[4] = 6;
                Input[] inputArr7 = Input.f367474b;
                iArr[6] = 7;
            }
        }

        static {
            new g();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$h;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class h implements State {
        static {
            new h();
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/triggers/State$i;", "Lcom/yandex/div/core/expression/triggers/State;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class i implements State {

        /* compiled from: ConditionPart.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Input.values().length];
                Input[] inputArr = Input.f367474b;
                iArr[0] = 1;
                Input[] inputArr2 = Input.f367474b;
                iArr[1] = 2;
                Input[] inputArr3 = Input.f367474b;
                iArr[2] = 3;
                Input[] inputArr4 = Input.f367474b;
                iArr[3] = 4;
                Input[] inputArr5 = Input.f367474b;
                iArr[5] = 5;
                Input[] inputArr6 = Input.f367474b;
                iArr[4] = 6;
                Input[] inputArr7 = Input.f367474b;
                iArr[6] = 7;
            }
        }

        static {
            new i();
        }
    }
}
