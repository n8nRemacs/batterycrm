package ru.cyberity.cbr.core.widget;

import X41.i;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43044a;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.R;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRTextInputEditText.kt */
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\b\u0010*\u0001n\u0018\u0000 v2\u00020\u0001:\u0007wvxyz{|B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\r*\u0004\u0018\u00010$2\b\b\u0002\u0010.\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100J)\u00106\u001a\u00020\r*\u000601j\u0002`22\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020!H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\rH\u0002¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u00109J\u000f\u0010E\u001a\u00020\rH\u0002¢\u0006\u0004\bE\u00109J#\u0010F\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bF\u0010GJ#\u0010H\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010@J!\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020'2\b\u0010A\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR>\u0010X\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n0Uj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n`W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR>\u0010Z\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n0Uj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n`W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010[R\u001a\u0010\\\u001a\u000601j\u0002`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\u000601j\u0002`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010]R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010f\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR4\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u000e\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bk\u0010l\"\u0004\bm\u0010\u000fR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0011\u0010s\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010u\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bt\u0010#¨\u0006}"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "masks", "Lkotlin/G0;", "setMasksString", "(Ljava/util/List;)V", "setMasks", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "defaultInputType", "updateInputType", "(Ljava/lang/Integer;)V", "maxLength", "setMaxLength", "(I)V", "selStart", "selEnd", "onSelectionChanged", "(II)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "isSuggestionsEnabled", "()Z", "Landroid/text/Editable;", "getText", "()Landroid/text/Editable;", "", "error", "setError", "(Ljava/lang/CharSequence;)V", "s", "applyMask", "(Landroid/text/Editable;)V", "clear", "removeHintSpans", "(Landroid/text/Editable;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", CharParameter.TYPE, "escaped", "appendMaskChar", "(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V", "cleanRaw", "()V", "findNewMask", "()Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "start", "prevValidCharPosition", "(I)I", "getStartingPosition", "()I", "mask", "prepareMask", "(Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;)V", "prepareMasks", "setDefaultMask", "getMaskSymbolsCount", "(ILjava/lang/String;)I", "getSpecialSymbolsInMaskedTextCount", "getRemovedSymbolsCount", "text", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskMatchResult;", "maskMatches", "(Ljava/lang/CharSequence;Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;)Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskMatchResult;", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskListener;", "maskListener", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskListener;", "getMaskListener", "()Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskListener;", "setMaskListener", "(Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskListener;)V", "Ljava/util/HashMap;", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$CharHolder;", "Lkotlin/collections/HashMap;", "masksCleared", "Ljava/util/HashMap;", "maskSymbolPositions", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "raw", "Ljava/lang/StringBuilder;", "lastRaw", "Ljava/lang/String;", "buffer", "maxRawLength", "I", "isTextChangingBefore", "Z", "isTextChangingAfter", "isSelectionChanging", "", "benchmark", "J", "value", "masksInternal", "Ljava/util/List;", "setMasksInternal", "ru/cyberity/cbr/core/widget/CBRTextInputEditText$textWatcher$1", "textWatcher", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$textWatcher$1;", "getRawText", "()Ljava/lang/String;", "rawText", "getMasksEnabled", "masksEnabled", "Companion", "CharHolder", "EditableProxy", "Mask", "MaskListener", "MaskMatchResult", "MyInputConnectionWrapper", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRTextInputEditText extends TextInputEditText {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final Character[] maskSymbols = {'#', '?', '*'};
    private long benchmark;

    @k
    private StringBuilder buffer;
    private boolean isSelectionChanging;
    private boolean isTextChangingAfter;
    private boolean isTextChangingBefore;

    @k
    private String lastRaw;

    @l
    private Mask mask;

    @l
    private MaskListener maskListener;

    @k
    private HashMap<String, List<CharHolder>> maskSymbolPositions;

    @k
    private HashMap<String, List<CharHolder>> masksCleared;

    @l
    private List<Mask> masksInternal;
    private int maxRawLength;

    @k
    private StringBuilder raw;

    @k
    private final CBRTextInputEditText$textWatcher$1 textWatcher;

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$CharHolder;", "", "", CharParameter.TYPE, "", "pos", "", "escaped", "<init>", "(CIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "C", "getChar", "()C", "I", "getPos", "Z", "getEscaped", "()Z", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CharHolder {
        private final char char;
        private final boolean escaped;
        private final int pos;

        public CharHolder(char c12, int i12, boolean z12) {
            this.char = c12;
            this.pos = i12;
            this.escaped = z12;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CharHolder)) {
                return false;
            }
            CharHolder charHolder = (CharHolder) other;
            return this.char == charHolder.char && this.pos == charHolder.pos && this.escaped == charHolder.escaped;
        }

        public final char getChar() {
            return this.char;
        }

        public final boolean getEscaped() {
            return this.escaped;
        }

        public final int getPos() {
            return this.pos;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iE2 = r.e(this.pos, Character.hashCode(this.char) * 31, 31);
            boolean z12 = this.escaped;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return iE2 + i12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharHolder(char=");
            sb2.append(this.char);
            sb2.append(", pos=");
            sb2.append(this.pos);
            sb2.append(", escaped=");
            return r.x(sb2, this.escaped, ')');
        }

        public /* synthetic */ CharHolder(char c12, int i12, boolean z12, int i13, C42822w c42822w) {
            this(c12, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? false : z12);
        }
    }

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u001f\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\n*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Companion;", "", "()V", "LOG_TAG", "", "maskSymbols", "", "", "[Ljava/lang/Character;", "isCharMaskPart", "", "symbol", "maskCharToPlaceholder", "modifyCharRegister", "maskChar", CharParameter.TYPE, "(Ljava/lang/Character;C)C", "symbolMatches", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$CharHolder;", "softMatch", "isUpperCaseMaskChar", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isCharMaskPart(char symbol) {
            return C42756l.h(Character.valueOf(symbol), CBRTextInputEditText.maskSymbols) || Character.isLetterOrDigit(symbol);
        }

        private final boolean isUpperCaseMaskChar(char c12) {
            return c12 == '?' || c12 == '*' || Character.isUpperCase(c12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char maskCharToPlaceholder(char symbol) {
            if (symbol == '#') {
                return '0';
            }
            if (symbol == '?' || symbol == '*') {
                return 'A';
            }
            return symbol;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char modifyCharRegister(Character maskChar, char c12) {
            return (maskChar == null || !isUpperCaseMaskChar(maskChar.charValue())) ? c12 : Character.toUpperCase(c12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean symbolMatches(char c12, CharHolder maskChar, boolean softMatch) {
            if (maskChar.getEscaped()) {
                return C43044a.c(c12, maskChar.getChar(), true);
            }
            if (maskChar.getChar() == '#') {
                return Character.isDigit(c12);
            }
            if (maskChar.getChar() == '?') {
                return Character.isLetter(c12);
            }
            if (maskChar.getChar() == '*') {
                if (Character.isDigit(c12) || Character.isLetter(c12)) {
                    return true;
                }
            } else {
                if (!softMatch) {
                    return C43044a.c(c12, maskChar.getChar(), true);
                }
                if (C43044a.c(c12, maskChar.getChar(), true)) {
                    return true;
                }
                if (Character.isDigit(c12) ? Character.isDigit(maskChar.getChar()) : Character.isLetter(c12) ? Character.isLetter(maskChar.getChar()) : true) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b\b\u0010\u000bJ8\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\b\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001e\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\f2\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b#\u0010\"J \u0010$\u001a\u00020\f2\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b$\u0010\"J\u0084\u0001\u0010'\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c\"\u0010\b\u0000\u0010%*\n \u0007*\u0004\u0018\u00010 0 2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2*\u0010\u000e\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000\u0018\u00010&0&H\u0096\u0001¢\u0006\u0004\b'\u0010(J0\u0010)\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b)\u0010*J@\u0010)\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b)\u0010+JH\u0010,\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2&\u0010\u000e\u001a\"\u0012\f\u0012\n \u0007*\u0004\u0018\u00010 0  \u0007*\u000b\u0012\u0002\b\u0003\u0018\u00010&¨\u0006\u00010&¨\u0006\u0001H\u0096\u0001¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\u00102\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b.\u0010/J8\u00100\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b0\u00101JH\u00100\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00102\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b0\u00103J>\u00104\u001a\u00020\u00102,\u0010\u0006\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b4\u00105J8\u00106\u001a\u00020\u00102\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b6\u00107J \u0010:\u001a\u00020\n2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010FR\u0014\u0010H\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010A¨\u0006I"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$EditableProxy;", "Landroid/text/Editable;", "editable", "<init>", "(Lru/cyberity/cbr/core/widget/CBRTextInputEditText;Landroid/text/Editable;)V", "", "p0", "kotlin.jvm.PlatformType", "append", "(C)Landroid/text/Editable;", "", "(Ljava/lang/CharSequence;)Landroid/text/Editable;", "", "p1", "p2", "(Ljava/lang/CharSequence;II)Landroid/text/Editable;", "Lkotlin/G0;", "clearSpans", "()V", "delete", "(II)Landroid/text/Editable;", "index", "get", "(I)C", "", "p3", "getChars", "(II[CI)V", "", "Landroid/text/InputFilter;", "getFilters", "()[Landroid/text/InputFilter;", "", "getSpanEnd", "(Ljava/lang/Object;)I", "getSpanFlags", "getSpanStart", "T", "Ljava/lang/Class;", "getSpans", "(IILjava/lang/Class;)[Ljava/lang/Object;", "insert", "(ILjava/lang/CharSequence;)Landroid/text/Editable;", "(ILjava/lang/CharSequence;II)Landroid/text/Editable;", "nextSpanTransition", "(IILjava/lang/Class;)I", "removeSpan", "(Ljava/lang/Object;)V", "replace", "(IILjava/lang/CharSequence;)Landroid/text/Editable;", "p4", "(IILjava/lang/CharSequence;II)Landroid/text/Editable;", "setFilters", "([Landroid/text/InputFilter;)V", "setSpan", "(Ljava/lang/Object;III)V", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "clear", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/text/Editable;", "getLength", "length", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class EditableProxy implements Editable {

        @k
        private final Editable editable;

        public EditableProxy(@k Editable editable) {
            this.editable = editable;
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(char p02) {
            return this.editable.append(p02);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i12) {
            return get(i12);
        }

        @Override // android.text.Editable
        public void clear() {
            this.editable.clear();
            CBRTextInputEditText.this.raw.setLength(0);
            CBRTextInputEditText.this.setText("");
        }

        @Override // android.text.Editable
        public void clearSpans() {
            this.editable.clearSpans();
        }

        @Override // android.text.Editable
        public Editable delete(int p02, int p12) {
            return this.editable.delete(p02, p12);
        }

        public boolean equals(@l Object other) {
            return this.editable.equals(other);
        }

        public char get(int index) {
            return this.editable.charAt(index);
        }

        @Override // android.text.GetChars
        public void getChars(int p02, int p12, char[] p22, int p32) {
            this.editable.getChars(p02, p12, p22, p32);
        }

        @Override // android.text.Editable
        public InputFilter[] getFilters() {
            return this.editable.getFilters();
        }

        public int getLength() {
            return this.editable.length();
        }

        @Override // android.text.Spanned
        public int getSpanEnd(Object p02) {
            return this.editable.getSpanEnd(p02);
        }

        @Override // android.text.Spanned
        public int getSpanFlags(Object p02) {
            return this.editable.getSpanFlags(p02);
        }

        @Override // android.text.Spanned
        public int getSpanStart(Object p02) {
            return this.editable.getSpanStart(p02);
        }

        @Override // android.text.Spanned
        public <T> T[] getSpans(int p02, int p12, Class<T> p22) {
            return (T[]) this.editable.getSpans(p02, p12, p22);
        }

        public int hashCode() {
            return this.editable.hashCode();
        }

        @Override // android.text.Editable
        public Editable insert(int p02, CharSequence p12) {
            return this.editable.insert(p02, p12);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        @Override // android.text.Spanned
        public int nextSpanTransition(int p02, int p12, Class p22) {
            return this.editable.nextSpanTransition(p02, p12, p22);
        }

        @Override // android.text.Spannable
        public void removeSpan(Object p02) {
            this.editable.removeSpan(p02);
        }

        @Override // android.text.Editable
        public Editable replace(int p02, int p12, CharSequence p22) {
            return this.editable.replace(p02, p12, p22);
        }

        @Override // android.text.Editable
        public void setFilters(InputFilter[] p02) {
            this.editable.setFilters(p02);
        }

        @Override // android.text.Spannable
        public void setSpan(Object p02, int p12, int p22, int p32) {
            this.editable.setSpan(p02, p12, p22, p32);
        }

        @Override // java.lang.CharSequence
        @k
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.editable.subSequence(startIndex, endIndex);
        }

        @Override // java.lang.CharSequence
        @k
        public String toString() {
            return this.editable.toString();
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(CharSequence p02) {
            return this.editable.append(p02);
        }

        @Override // android.text.Editable
        public Editable insert(int p02, CharSequence p12, int p22, int p32) {
            return this.editable.insert(p02, p12, p22, p32);
        }

        @Override // android.text.Editable
        public Editable replace(int p02, int p12, CharSequence p22, int p32, int p42) {
            return this.editable.replace(p02, p12, p22, p32, p42);
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(CharSequence p02, int p12, int p22) {
            return this.editable.append(p02, p12, p22);
        }
    }

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskListener;", "", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "newMask", "Lkotlin/G0;", "onMaskChanged", "(Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;)V", "", "raw", "", "preFilterMasks", "(Ljava/lang/CharSequence;)Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface MaskListener {
        void onMaskChanged(@l Mask newMask);

        @l
        default List<Mask> preFilterMasks(@k CharSequence raw) {
            return null;
        }
    }

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MaskMatchResult;", "", "", "matches", "", "weight", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "mask", "<init>", "(ZILru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getMatches", "()Z", "I", "getWeight", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "getMask", "()Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class MaskMatchResult {

        @l
        private final Mask mask;
        private final boolean matches;
        private final int weight;

        public MaskMatchResult(boolean z12, int i12, @l Mask mask) {
            this.matches = z12;
            this.weight = i12;
            this.mask = mask;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaskMatchResult)) {
                return false;
            }
            MaskMatchResult maskMatchResult = (MaskMatchResult) other;
            return this.matches == maskMatchResult.matches && this.weight == maskMatchResult.weight && L.f(this.mask, maskMatchResult.mask);
        }

        @l
        public final Mask getMask() {
            return this.mask;
        }

        public final boolean getMatches() {
            return this.matches;
        }

        public final int getWeight() {
            return this.weight;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z12 = this.matches;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            int iE2 = r.e(this.weight, r02 * 31, 31);
            Mask mask = this.mask;
            return iE2 + (mask == null ? 0 : mask.hashCode());
        }

        @k
        public String toString() {
            return "MaskMatchResult(matches=" + this.matches + ", weight=" + this.weight + ", mask=" + this.mask + ')';
        }
    }

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$MyInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "(Lru/cyberity/cbr/core/widget/CBRTextInputEditText;Landroid/view/inputmethod/InputConnection;Z)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MyInputConnectionWrapper extends InputConnectionWrapper {
        public MyInputConnectionWrapper(@k InputConnection inputConnection, boolean z12) {
            super(inputConnection, z12);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            if (CBRTextInputEditText.this.raw.length() != 0) {
                return super.deleteSurroundingText(beforeLength, afterLength);
            }
            Logger.i$default(ru.cyberity.log.a.f436064a, "CBRInputEditText", "Delete event return", null, 4, null);
            CBRTextInputEditText.this.setText((CharSequence) null);
            return true;
        }
    }

    @j
    public CBRTextInputEditText(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void appendMaskChar(StringBuilder sb2, Character ch2, boolean z12) {
        if (ch2 == null) {
            return;
        }
        if (z12) {
            sb2.append(ch2.charValue());
        } else {
            sb2.append(INSTANCE.maskCharToPlaceholder(ch2.charValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMask(Editable s5) {
        int i12;
        int i13;
        if (getMasksEnabled()) {
            if (this.mask == null) {
                if (s5 != null) {
                    removeHintSpans(s5, false);
                    return;
                }
                return;
            }
            this.buffer.setLength(0);
            if (s5 != null) {
                removeHintSpans$default(this, s5, false, 1, null);
            }
            HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
            Mask mask = this.mask;
            List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
            if (list != null) {
                i12 = 0;
                for (CharHolder charHolder : list) {
                    char c12 = charHolder.getChar();
                    if (charHolder.getPos() < 0) {
                        appendMaskChar(this.buffer, Character.valueOf(c12), charHolder.getEscaped());
                    } else if (charHolder.getPos() < this.raw.length()) {
                        this.buffer.append(INSTANCE.modifyCharRegister(Character.valueOf(c12), this.raw.charAt(charHolder.getPos())));
                        i12++;
                    } else {
                        appendMaskChar(this.buffer, Character.valueOf(c12), charHolder.getEscaped());
                    }
                }
            } else {
                i12 = 0;
            }
            int length = this.raw.length();
            for (int i14 = i12; i14 < length; i14++) {
                this.buffer.append(this.raw.charAt(i14));
            }
            if (s5 != null) {
                s5.append((CharSequence) this.buffer);
            }
            if (list != null) {
                Iterator<CharHolder> it = list.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    if (it.next().getPos() == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
                i13 = -1;
            } else {
                i13 = -1;
            }
            if (i13 < 0 || s5 == null) {
                return;
            }
            s5.setSpan(new ForegroundColorSpan(getCurrentHintTextColor()), i13, s5.length(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanRaw() {
        if (this.mask == null) {
            return;
        }
        StringBuilder sb2 = this.raw;
        StringBuilder sb3 = new StringBuilder();
        int length = sb2.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = sb2.charAt(i12);
            if (INSTANCE.isCharMaskPart(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        CharSequence charSequenceS0 = C43066x.s0(this.maxRawLength, sb3);
        if (charSequenceS0.length() != this.raw.length()) {
            this.raw.setLength(0);
            this.raw.append(charSequenceS0);
        }
        if (this.raw.length() == 0) {
            setDefaultMask();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Mask findNewMask() {
        List<Mask> listPreFilterMasks;
        ArrayList arrayList;
        ArrayList arrayList2;
        MaskMatchResult maskMatchResult;
        Object next;
        MaskMatchResult maskMatchResultMaskMatches;
        Mask mask = this.mask;
        StringBuilder sb2 = this.raw;
        MaskListener maskListener = this.maskListener;
        if (maskListener == null || (listPreFilterMasks = maskListener.preFilterMasks(sb2)) == null) {
            listPreFilterMasks = this.masksInternal;
        }
        if (listPreFilterMasks != null) {
            arrayList = new ArrayList(C42745f0.q(listPreFilterMasks, 10));
            Iterator<T> it = listPreFilterMasks.iterator();
            while (it.hasNext()) {
                arrayList.add(maskMatches(sb2, (Mask) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((MaskMatchResult) obj).getMatches()) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((MaskMatchResult) it2.next()).getWeight() != ((MaskMatchResult) arrayList2.get(0)).getWeight()) {
                        break;
                    }
                }
                maskMatchResultMaskMatches = maskMatches(sb2, mask);
                if (maskMatchResultMaskMatches.getMatches() && maskMatchResultMaskMatches.getWeight() >= ((MaskMatchResult) arrayList2.get(0)).getWeight()) {
                    return mask;
                }
            } else {
                maskMatchResultMaskMatches = maskMatches(sb2, mask);
                if (maskMatchResultMaskMatches.getMatches()) {
                    return mask;
                }
            }
        }
        if (arrayList2 != null) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int weight = ((MaskMatchResult) next).getWeight();
                    do {
                        Object next2 = it3.next();
                        int weight2 = ((MaskMatchResult) next2).getWeight();
                        if (weight < weight2) {
                            next = next2;
                            weight = weight2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            maskMatchResult = (MaskMatchResult) next;
        } else {
            maskMatchResult = null;
        }
        if (maskMatchResult != null) {
            return maskMatchResult.getMask();
        }
        return null;
    }

    private final int getMaskSymbolsCount(int maxLength, String mask) {
        List<CharHolder> list = this.maskSymbolPositions.get(mask);
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size && i13 != maxLength; i13++) {
            if (list.get(i13).getPos() >= 0) {
                i12++;
            }
        }
        return maxLength > i12 ? maxLength - getSpecialSymbolsInMaskedTextCount(maxLength, mask) : i12;
    }

    public static /* synthetic */ int getMaskSymbolsCount$default(CBRTextInputEditText cBRTextInputEditText, int i12, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            Mask mask = cBRTextInputEditText.mask;
            str = mask != null ? mask.getMask() : null;
        }
        return cBRTextInputEditText.getMaskSymbolsCount(i12, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRemovedSymbolsCount() {
        return this.lastRaw.length() - this.raw.length();
    }

    private final int getSpecialSymbolsInMaskedTextCount(int maxLength, String mask) {
        List<CharHolder> list;
        if (maxLength <= 0 || (list = this.maskSymbolPositions.get(mask)) == null) {
            return 0;
        }
        int length = this.raw.length();
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size && i14 != maxLength && i12 != length; i14++) {
            if (list.get(i14).getPos() < 0) {
                i13++;
            } else {
                i12++;
            }
        }
        return i13;
    }

    public static /* synthetic */ int getSpecialSymbolsInMaskedTextCount$default(CBRTextInputEditText cBRTextInputEditText, int i12, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            Mask mask = cBRTextInputEditText.mask;
            str = mask != null ? mask.getMask() : null;
        }
        return cBRTextInputEditText.getSpecialSymbolsInMaskedTextCount(i12, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getStartingPosition() {
        HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
        if (list == null) {
            return 0;
        }
        Iterator<CharHolder> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().getPos() >= 0) {
                break;
            }
            i12++;
        }
        Integer numValueOf = i12 >= 0 ? Integer.valueOf(i12) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final MaskMatchResult maskMatches(CharSequence text, Mask mask) {
        if (mask == null) {
            return new MaskMatchResult(false, 0, mask);
        }
        List<CharHolder> list = this.masksCleared.get(mask.getMask());
        if (list == null) {
            return new MaskMatchResult(false, 0, mask);
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 1;
            if (i12 >= text.length()) {
                return new MaskMatchResult(true, i13, mask);
            }
            char cCharAt = text.charAt(i12);
            int i16 = i14 + 1;
            if (i14 >= list.size()) {
                return new MaskMatchResult(mask.getMaskValidIfOverflow(), i13, mask);
            }
            if (!INSTANCE.symbolMatches(cCharAt, list.get(i14), mask.getSoftMatch())) {
                return new MaskMatchResult(false, i13, mask);
            }
            if (C43044a.c(cCharAt, list.get(i14).getChar(), true)) {
                i15 = 4;
            } else if ((list.get(i14).getChar() == '#' && Character.isDigit(cCharAt)) || (list.get(i14).getChar() == '?' && Character.isLetter(cCharAt))) {
                i15 = 2;
            }
            i13 += i15;
            i12++;
            i14 = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareMask(Mask mask) {
        if (L.f(this.mask, mask)) {
            return;
        }
        Logger.i$default(ru.cyberity.log.a.f436064a, "CBRInputEditText", "prepareMask " + mask, null, 4, null);
        this.mask = mask;
        MaskListener maskListener = this.maskListener;
        if (maskListener != null) {
            maskListener.onMaskChanged(mask);
        }
    }

    private final void prepareMasks() {
        CBRTextInputEditText cBRTextInputEditText = this;
        List<Mask> list = cBRTextInputEditText.masksInternal;
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Mask mask = (Mask) obj;
                ArrayList arrayList = new ArrayList();
                cBRTextInputEditText.maskSymbolPositions.put(mask.getMask(), arrayList);
                ArrayList arrayList2 = new ArrayList();
                cBRTextInputEditText.masksCleared.put(mask.getMask(), arrayList2);
                String mask2 = mask.getMask();
                int i14 = 0;
                boolean z12 = false;
                for (int i15 = 0; i15 < mask2.length(); i15++) {
                    char cCharAt = mask2.charAt(i15);
                    if (cCharAt != '\\' || z12) {
                        if (!INSTANCE.isCharMaskPart(cCharAt) || z12) {
                            arrayList.add(new CharHolder(cCharAt, -1, z12));
                            i14 = i14;
                        } else {
                            int i16 = i14;
                            arrayList2.add(new CharHolder(cCharAt, 0, z12, 2, null));
                            arrayList.add(new CharHolder(cCharAt, i16, z12));
                            i14 = i16 + 1;
                        }
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                }
                Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Mask " + mask + " cleared " + arrayList2, null, 4, null);
                cBRTextInputEditText = this;
                i12 = i13;
            }
        }
        setDefaultMask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int prevValidCharPosition(int start) {
        CharHolder charHolder;
        if (start < 0) {
            return 0;
        }
        HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
        return (list == null || (charHolder = (CharHolder) C42745f0.K(start, list)) == null) ? start - getSpecialSymbolsInMaskedTextCount$default(this, start, null, 2, null) : charHolder.getPos() < 0 ? prevValidCharPosition(start - 1) : charHolder.getPos();
    }

    private final void removeHintSpans(Editable editable, boolean z12) {
        if (editable == null) {
            return;
        }
        if (z12) {
            editable.clear();
        }
        for (Object obj : editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            editable.removeSpan((ForegroundColorSpan) obj);
        }
    }

    public static /* synthetic */ void removeHintSpans$default(CBRTextInputEditText cBRTextInputEditText, Editable editable, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = true;
        }
        cBRTextInputEditText.removeHintSpans(editable, z12);
    }

    private final void setDefaultMask() {
        List<Mask> list = this.masksInternal;
        Mask mask = null;
        Object next = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int length = ((Mask) next).getMask().length();
                    do {
                        Object next2 = it.next();
                        int length2 = ((Mask) next2).getMask().length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            mask = (Mask) next;
        }
        prepareMask(mask);
    }

    private final void setMasksInternal(List<Mask> list) {
        this.masksInternal = list;
        if (list != null && (!list.isEmpty())) {
            updateInputType$default(this, null, 1, null);
        }
        prepareMasks();
    }

    public static /* synthetic */ void updateInputType$default(CBRTextInputEditText cBRTextInputEditText, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = null;
        }
        cBRTextInputEditText.updateInputType(num);
    }

    @l
    public final MaskListener getMaskListener() {
        return this.maskListener;
    }

    public final boolean getMasksEnabled() {
        List<Mask> list = this.masksInternal;
        return list != null && (list.isEmpty() ^ true);
    }

    @k
    public final String getRawText() {
        return (!getMasksEnabled() || this.mask == null) ? String.valueOf(getText()) : this.raw.toString();
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        if (getMasksEnabled()) {
            return false;
        }
        return super.isSuggestionsEnabled();
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @l
    public InputConnection onCreateInputConnection(@k EditorInfo outAttrs) {
        if (!getMasksEnabled()) {
            return super.onCreateInputConnection(outAttrs);
        }
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new MyInputConnectionWrapper(inputConnectionOnCreateInputConnection, true);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.isTextChangingAfter || this.isTextChangingBefore || this.isSelectionChanging || !getMasksEnabled()) {
            return;
        }
        super.onSelectionChanged(selStart, selEnd);
        HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
        if (list == null) {
            return;
        }
        int specialSymbolsInMaskedTextCount$default = getSpecialSymbolsInMaskedTextCount$default(this, selStart, null, 2, null) + this.raw.length();
        int specialSymbolsInMaskedTextCount$default2 = getSpecialSymbolsInMaskedTextCount$default(this, selEnd, null, 2, null) + this.raw.length();
        int startingPosition = getStartingPosition();
        int iMax = Math.max(startingPosition, Math.min(specialSymbolsInMaskedTextCount$default, selStart));
        int iMax2 = Math.max(startingPosition, Math.min(specialSymbolsInMaskedTextCount$default2, selEnd));
        while (iMax < list.size() && list.get(iMax).getPos() < 0) {
            iMax++;
        }
        while (iMax2 < list.size() && list.get(iMax2).getPos() < 0) {
            iMax2++;
        }
        this.isSelectionChanging = true;
        setSelection(iMax, iMax2);
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        String strA = ru.cyberity.log.c.a(this);
        StringBuilder sbY = r.y(selStart, selEnd, "onSelectionChanged, selStart=", ", selEnd=", ", start=");
        sbY.append(iMax);
        sbY.append(", end=");
        sbY.append(iMax2);
        Logger.i$default(aVar, strA, sbY.toString(), null, 4, null);
        this.isSelectionChanging = false;
    }

    @Override // android.widget.TextView
    public void setError(@l CharSequence error) {
        super.setError(error);
    }

    public final void setMaskListener(@l MaskListener maskListener) {
        this.maskListener = maskListener;
    }

    public final void setMasks(@l List<Mask> masks) {
        setMasksInternal(masks);
    }

    @i
    public final void setMasksString(@l List<String> masks) {
        ArrayList arrayList;
        if (masks != null) {
            arrayList = new ArrayList(C42745f0.q(masks, 10));
            Iterator<T> it = masks.iterator();
            while (it.hasNext()) {
                arrayList.add(new Mask((String) it.next(), false, false, false, null, 30, null));
            }
        } else {
            arrayList = null;
        }
        setMasksInternal(arrayList);
    }

    public final void setMaxLength(int maxLength) {
        this.maxRawLength = maxLength;
    }

    public final void updateInputType(@l Integer defaultInputType) {
        Typeface typeface = getTypeface();
        setInputType(defaultInputType != null ? 524432 | defaultInputType.intValue() : 524432);
        setFilters(new InputFilter[0]);
        setTypeface(typeface);
    }

    public /* synthetic */ CBRTextInputEditText(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.cbr_TextInputEditTextStyle : i12);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    @l
    public Editable getText() {
        Editable text = super.getText();
        return (!getMasksEnabled() || text == null) ? text : new EditableProxy(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.text.TextWatcher, ru.cyberity.cbr.core.widget.CBRTextInputEditText$textWatcher$1] */
    @j
    public CBRTextInputEditText(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.masksCleared = new HashMap<>();
        this.maskSymbolPositions = new HashMap<>();
        this.raw = new StringBuilder();
        this.lastRaw = "";
        this.buffer = new StringBuilder();
        this.maxRawLength = Integer.MAX_VALUE;
        ?? r12 = new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.CBRTextInputEditText$textWatcher$1
            /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void afterTextChanged(@Y61.l android.text.Editable r15) {
                /*
                    Method dump skipped, instructions count: 525
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.widget.CBRTextInputEditText$textWatcher$1.afterTextChanged(android.text.Editable):void");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@l CharSequence s5, int start, int count, int after) {
                if (!this.this$0.getMasksEnabled() || this.this$0.isTextChangingAfter) {
                    return;
                }
                this.this$0.benchmark = System.currentTimeMillis();
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                StringBuilder sbY = r.y(start, count, "beforeTextChanged, start=", ", count=", ", after=");
                sbY.append(after);
                sbY.append(", s=");
                sbY.append((Object) s5);
                Logger.v$default(aVar, "CBRInputEditText", sbY.toString(), null, 4, null);
                this.this$0.isTextChangingBefore = true;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@l CharSequence s5, int start, int before, int count) {
                CharSequence charSequenceSubSequence;
                if (this.this$0.getMasksEnabled() && this.this$0.isTextChangingBefore && !this.this$0.isTextChangingAfter) {
                    ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                    StringBuilder sbY = r.y(start, before, "onTextChanged, start=", ", before=", ", count=");
                    sbY.append(count);
                    sbY.append(", s=");
                    sbY.append((Object) s5);
                    Logger.v$default(aVar, "CBRInputEditText", sbY.toString(), null, 4, null);
                    if (this.this$0.mask != null) {
                        CBRTextInputEditText cBRTextInputEditText = this.this$0;
                        cBRTextInputEditText.lastRaw = cBRTextInputEditText.raw.toString();
                        if (count > 0) {
                            if (s5 == null || (charSequenceSubSequence = s5.subSequence(start, start + count)) == null) {
                                return;
                            }
                            int maskSymbolsCount$default = CBRTextInputEditText.getMaskSymbolsCount$default(this.this$0, start, null, 2, null);
                            StringBuilder sbY2 = r.y(start, maskSymbolsCount$default, "onTextChanged, start=", ", rawStart=", ", addedText=");
                            sbY2.append((Object) charSequenceSubSequence);
                            Logger.v$default(aVar, "CBRInputEditText", sbY2.toString(), null, 4, null);
                            if (maskSymbolsCount$default > this.this$0.raw.length()) {
                                this.this$0.raw.append(charSequenceSubSequence);
                            } else {
                                int i13 = count + maskSymbolsCount$default;
                                if (this.this$0.raw.length() >= i13) {
                                    this.this$0.raw.insert(maskSymbolsCount$default, charSequenceSubSequence);
                                } else {
                                    this.this$0.raw.replace(maskSymbolsCount$default, i13, charSequenceSubSequence.toString());
                                }
                            }
                        } else if (start >= this.this$0.getStartingPosition()) {
                            int iPrevValidCharPosition = this.this$0.prevValidCharPosition(start);
                            this.this$0.raw.delete(iPrevValidCharPosition, Math.min(before + iPrevValidCharPosition, this.this$0.raw.length()));
                        }
                    } else {
                        this.this$0.raw.setLength(0);
                        this.this$0.raw.append(s5);
                    }
                    Logger.v$default(aVar, "CBRInputEditText", "onTextChanged, RawText = " + ((Object) this.this$0.raw), null, 4, null);
                }
            }
        };
        this.textWatcher = r12;
        addTextChangedListener(r12);
    }

    /* compiled from: CBRTextInputEditText.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputEditText$Mask;", "", "", "mask", "", "limitInputByLength", "maskValidIfOverflow", "softMatch", "payload", "<init>", "(Ljava/lang/String;ZZZLjava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMask", "Z", "getLimitInputByLength", "()Z", "getMaskValidIfOverflow", "getSoftMatch", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Mask {
        private final boolean limitInputByLength;

        @k
        private final String mask;
        private final boolean maskValidIfOverflow;

        @l
        private final Object payload;
        private final boolean softMatch;

        public Mask(@k String str, boolean z12, boolean z13, boolean z14, @l Object obj) {
            this.mask = str;
            this.limitInputByLength = z12;
            this.maskValidIfOverflow = z13;
            this.softMatch = z14;
            this.payload = obj;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mask)) {
                return false;
            }
            Mask mask = (Mask) other;
            return L.f(this.mask, mask.mask) && this.limitInputByLength == mask.limitInputByLength && this.maskValidIfOverflow == mask.maskValidIfOverflow && this.softMatch == mask.softMatch && L.f(this.payload, mask.payload);
        }

        @k
        public final String getMask() {
            return this.mask;
        }

        public final boolean getMaskValidIfOverflow() {
            return this.maskValidIfOverflow;
        }

        @l
        public final Object getPayload() {
            return this.payload;
        }

        public final boolean getSoftMatch() {
            return this.softMatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.mask.hashCode() * 31;
            boolean z12 = this.limitInputByLength;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode + i12) * 31;
            boolean z13 = this.maskValidIfOverflow;
            int i14 = z13;
            if (z13 != 0) {
                i14 = 1;
            }
            int i15 = (i13 + i14) * 31;
            boolean z14 = this.softMatch;
            int i16 = (i15 + (z14 ? 1 : z14 ? 1 : 0)) * 31;
            Object obj = this.payload;
            return i16 + (obj == null ? 0 : obj.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Mask(mask=");
            sb2.append(this.mask);
            sb2.append(", limitInputByLength=");
            sb2.append(this.limitInputByLength);
            sb2.append(", maskValidIfOverflow=");
            sb2.append(this.maskValidIfOverflow);
            sb2.append(", softMatch=");
            sb2.append(this.softMatch);
            sb2.append(", payload=");
            return H.n(sb2, this.payload, ')');
        }

        public /* synthetic */ Mask(String str, boolean z12, boolean z13, boolean z14, Object obj, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? true : z14, (i12 & 16) != 0 ? null : obj);
        }
    }
}
